package uz.unnarsx.cherrygram.tgkit.preference.types;

import uz.unnarsx.cherrygram.tgkit.preference.TGKitPreference;

public class TGKitHeaderRow extends TGKitPreference {
    public TGKitHeaderRow(String title) {
        this.title = title;
    }

    @Override
    public TGPType getType() {
        return TGPType.HEADER;
    }
}
