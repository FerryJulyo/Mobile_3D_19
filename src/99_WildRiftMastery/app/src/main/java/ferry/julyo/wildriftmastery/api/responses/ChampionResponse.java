package ferry.julyo.wildriftmastery.api.responses;


import java.util.List;

public class ChampionResponse {

    private String version;
    private String id;
    private String name;
    private String title;
    private String lore;
    private List<String> allytips;
    private List<String> enemytips;
    private ImageResponse image;
    private List<String> tags;
    private List<SpellResponse> spells;
    private PassiveResponse passive;
    private List<SkinResponse> skins;

    public ChampionResponse() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageResponse getImage() {
        return image;
    }

    public void setImage(ImageResponse image) {
        this.image = image;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public List<String> getAllytips() {
        return allytips;
    }

    public void setAllytips(List<String> allytips) {
        this.allytips = allytips;
    }

    public List<String> getEnemytips() {
        return enemytips;
    }

    public void setEnemytips(List<String> enemytips) {
        this.enemytips = enemytips;
    }

    public List<SpellResponse> getSpells() {
        return spells;
    }

    public void setSpells(List<SpellResponse> spells) {
        this.spells = spells;
    }

    public PassiveResponse getPassive() {
        return passive;
    }

    public void setPassive(PassiveResponse passive) {
        this.passive = passive;
    }

    public List<SkinResponse> getSkins() {
        return skins;
    }

    public void setSkins(List<SkinResponse> skins) {
        this.skins = skins;
    }

}
