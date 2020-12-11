package ferry.julyo.wildriftmastery;

import java.util.ArrayList;

class HeroesData {
    private static String[] heroNames = {
            "Ahri",
            "Garen",
            "Jinx",
            "Lux",
            "Yasuo",
            "Ahri",
            "Garen",
            "Jinx",
            "Lux",
            "Yasuo"
    };

    private static String[] heroDetails = {
            "Ahri first encountered humans when a troop of foreign soldiers camped near her den. Their behaviors were strange to Ahri and, curious to learn more, she watched them from afar. She was especially drawn to a hunter who, unlike his wasteful companions, used every part of the animals he killed, reminding her of her fox family.",
            "Demacia was founded by the weary survivors of the Rune Wars, those looking for a life of peace after enduring the unspeakable destruction that came from the misuse of magic.",
            "No one knows for sure exactly where Jinx came from, but many urban legends and folktales have sprung up around her. Some have her as a young gang member who fell in with the wrong crowd and was either traumatized by one too many killings, suffered too much at the hands of an enemy, or was simply driven insane by sump fumes.",
            "Luxanna - or Lux, as she preferred to be called - grew up in the Demacian city of High Silvermere, one of two children born to the prestigious Crownguard lineage, an honorific given to the family tasked with protecting the king.",
            "An Ionian of deep resolve, Yasuo is an agile swordsman who wields the air itself against his enemies. As a proud young man, he was falsely accused of murdering his master—unable to prove his innocence, he was forced to slay his own brother in self defense.",
            "Ahri first encountered humans when a troop of foreign soldiers camped near her den. Their behaviors were strange to Ahri and, curious to learn more, she watched them from afar. She was especially drawn to a hunter who, unlike his wasteful companions, used every part of the animals he killed, reminding her of her fox family.",
            "Demacia was founded by the weary survivors of the Rune Wars, those looking for a life of peace after enduring the unspeakable destruction that came from the misuse of magic.",
            "No one knows for sure exactly where Jinx came from, but many urban legends and folktales have sprung up around her. Some have her as a young gang member who fell in with the wrong crowd and was either traumatized by one too many killings, suffered too much at the hands of an enemy, or was simply driven insane by sump fumes.",
            "Luxanna - or Lux, as she preferred to be called - grew up in the Demacian city of High Silvermere, one of two children born to the prestigious Crownguard lineage, an honorific given to the family tasked with protecting the king.",
            "An Ionian of deep resolve, Yasuo is an agile swordsman who wields the air itself against his enemies. As a proud young man, he was falsely accused of murdering his master—unable to prove his innocence, he was forced to slay his own brother in self defense."
    };

    private static int[] heroesImages = {
            R.drawable.ahri,
            R.drawable.garen,
            R.drawable.jinx,
            R.drawable.lux,
            R.drawable.yasuo,
            R.drawable.ahri,
            R.drawable.garen,
            R.drawable.jinx,
            R.drawable.lux,
            R.drawable.yasuo
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}