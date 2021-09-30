package com.teamphonix.wordlock.activities.words.placeholder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<PlaceholderItem> ITEMS = new ArrayList<PlaceholderItem>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static final Map<String, PlaceholderItem> ITEM_MAP = new HashMap<String, PlaceholderItem>();

    private static final int COUNT = 25;

    static {
        addItem(new PlaceholderItem("denote", true));
        addItem(new PlaceholderItem("deny", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("demonstrate", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));
        addItem(new PlaceholderItem("depress", false));

    }

    private static void addItem(PlaceholderItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.word, item);
    }

    private static String getWord(int position) {
        String[] values = new String[]{"denote", "deny", "depress",
                "demonstrate", "aware", "automate", "authority", "available",
                "author", "attribute", "attach", "attain", "attitude", "assume",
                "assit", "assure", "assign", "assess", "assemble", "area",
                "aspect", "appropriate", "bond", "brief", "bais"};
        return values[position];
    }


    /**
     * A placeholder item representing a piece of content.
     */
    public static class PlaceholderItem {
        public final String word;
        public final boolean isFavourite;

        public PlaceholderItem(String word, boolean isFavourite) {
            this.word = word;
            this.isFavourite = isFavourite;
        }

    }
}