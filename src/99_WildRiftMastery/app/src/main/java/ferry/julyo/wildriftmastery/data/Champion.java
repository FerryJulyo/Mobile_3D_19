package ferry.julyo.wildriftmastery.data;



import androidx.annotation.NonNull;

import ferry.julyo.wildriftmastery.api.ApiClient;
import ferry.julyo.wildriftmastery.api.responses.ChampionResponse;
import ferry.julyo.wildriftmastery.api.responses.PassiveResponse;
import ferry.julyo.wildriftmastery.api.responses.SpellResponse;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Champion implements Serializable {
    private String name;
    private String title;
    private String lore;
    private String imagePath;
    private List<Ability> abilities;
    private List<String> tags;
    private List<String> allyTips;
    private List<String> enemyTips;

    public Champion(String name, String title, String lore, String image, List<Ability> abilities, List<String> tags, List<String> allyTips, List<String> enemyTips) {
        this.name = name;
        this.title = title;
        this.lore = lore;
        this.imagePath = image;
        this.abilities = abilities;
        this.tags = tags;
        this.allyTips = allyTips;
        this.enemyTips = enemyTips;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getLore() {
        return lore;
    }

    public List<Ability> getAbilities() {
        return this.abilities;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<String> getAllyTips() {
        return allyTips;
    }

    public List<String> getEnemyTips() {
        return enemyTips;
    }

    public static abstract class Ability implements Serializable {
        private String name;
        private String description;
        private String imagePath;

        Ability(String name, String description, String image) {
            this.name = name;
            this.description = description;
            this.imagePath = image;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getImagePath() {
            return imagePath;
        }
    }

    public static final class Passive extends Ability {

        Passive(String name, String description, String image) {
            super(name, description, image);
        }
    }

    public static final class Spell extends Ability {
        private String cost;
        private String cooldown;

        Spell(String name, String cost, String cooldown, String description, String image) {
            super(name, description, image);
            this.cost = cost;
            this.cooldown = cooldown;
        }

        public String getCost() {
            return cost;
        }

        public String getCooldown() {
            return cooldown;
        }

    }


    /**
     * @param obj the champion object to compare
     * @return true if names are equals
     */
    @Override
    public boolean equals(Object obj) {
        return this.getName().equals(((Champion) obj).getName());
    }

    @NonNull
    @Override
    public String toString() {
        return this.getName();
    }

    public static final class Builder {
        private static final float MAX_SPEED = 400.0f;
        private ChampionResponse championResponse;
        private String baseUrlImage;
        private List<Ability> abilities = new ArrayList<>();

        public Builder() {
        }

        public Builder withChampionResponse(ChampionResponse championResponse) {
            this.championResponse = championResponse;
            return this;
        }

        public Builder withBaseImageUrl(String baseUrlImage) {
            this.baseUrlImage = baseUrlImage;
            return this;
        }

        public Champion build() {

            if (this.championResponse.getPassive() != null) {
                String path = String.format("%s/img/passive/", ApiClient.VERSION);
                PassiveResponse pr = this.championResponse.getPassive();
                this.abilities.add(
                        new Champion.Passive(
                                pr.getName(),
                                pr.getDescription(),
                                this.baseUrlImage + path + pr.getImage().getFull()));
            }

            if (this.championResponse.getSpells() != null) {
                String path = String.format("%s/img/spell/", ApiClient.VERSION);
                for (SpellResponse sr : this.championResponse.getSpells()) {

                    this.abilities.add(
                            new Champion.Spell(
                                    sr.getName(),
                                    sr.getCostBurn(),
                                    sr.getCooldownBurn(),
                                    sr.getDescription(),
                                    this.baseUrlImage + path + sr.getImage().getFull()));
                }
            }


            return new Champion(this.championResponse.getName(),
                    this.championResponse.getTitle(),
                    this.championResponse.getLore(),
                    String.format("%s%s", this.baseUrlImage, this.championResponse.getImage().getFull()),
                    this.abilities,
                    this.championResponse.getTags(),
                    this.championResponse.getAllytips(),
                    this.championResponse.getEnemytips());
        }
    }
}
