package ferry.julyo.wildriftmastery.api.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ChampionResponse {
    @JsonProperty("version")
    private String version;

    @JsonProperty("id")
    private String id;

    @JsonProperty("key")
    private String key;

    @JsonProperty("name")
    private String name;

    @JsonProperty("title")
    private String title;

    @JsonProperty("blurb")
    private String blurb;

    @JsonProperty("lore")
    private String lore;

    @JsonProperty("allytips")
    private List<String> allytips;

    @JsonProperty("enemytips")
    private List<String> enemytips;

    @JsonProperty("image")
    private ImageResponse image;

    @JsonProperty("tags")
    private List<String> tags;

    @JsonProperty("partype")
    private String partype;

    @JsonProperty("spells")
    private List<SpellResponse> spells;

    @JsonProperty("passive")
    private PassiveResponse passive;

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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
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

    public String getPartype() {
        return partype;
    }

    public void setPartype(String partype) {
        this.partype = partype;
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

}
