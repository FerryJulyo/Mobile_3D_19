package ferry.julyo.wildriftmastery.api.responses;


import java.util.Map;

public class ChampionsResponse {

    private String version;
    private Map<String, ChampionResponse> data;

    public ChampionsResponse() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String value) {
        this.version = value;
    }

    public Map<String, ChampionResponse> getData() {
        return data;
    }

    public void setData(Map<String, ChampionResponse> value) {
        this.data = value;
    }
}

