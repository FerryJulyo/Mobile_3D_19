package ferry.julyo.wildriftmastery.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import ferry.julyo.wildriftmastery.api.services.ChampionService;

import java.util.List;
import java.util.Locale;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class ApiClient {
    public static final String BASE_URL = "https://ddragon.leagueoflegends.com/cdn/";
    public static final String VERSION = "10.25.1";
    public static final String BASE_URL_IMAGE = String.format("%s%s/img/champion/", BASE_URL, VERSION);
    private static final String DEFAULT_LANGUAGE = "en_US";
    private static ApiClient instance;
    private static List<String> supportedLocales;
    private Retrofit retrofit;
    private ChampionService championService;


    private ApiClient() {
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .build();


        this.championService = retrofit.create(ChampionService.class);


    }


    public static ApiClient getInstance() {
        if (instance == null) {
            instance = new ApiClient();
        }
        return instance;
    }

    public static String getLocale() {
        String displayLanguage = Locale.getDefault().toString();
        if (supportedLocales.contains(displayLanguage)) {
            return displayLanguage;
        }
        return DEFAULT_LANGUAGE;
    }

    public ChampionService getChampionService() {
        return this.championService;
    }
}
