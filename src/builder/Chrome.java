package builder;

public class Chrome {

    private String plugin;
    private String plugin2;
    private String plugin3;
    private Boolean adblock;
    private Boolean talentAPI;

    private Chrome(ChomeDLC DLC) {
        this.plugin = DLC.plugin;
        this.plugin2 = DLC.plugin2;
        this.plugin3 = DLC.plugin3;
        this.adblock = DLC.adblock;
        this.talentAPI = DLC.talentAPI;
    }

    public static class ChomeDLC {
        private String plugin;
        private String plugin2;
        private String plugin3;
        private Boolean adblock = false;
        private Boolean talentAPI = false;

        public ChomeDLC(String plugin, String plugin2, String plugin3) {
            this.plugin = plugin;
            this.plugin2 = plugin2;
            this.plugin3 = plugin3;
        }

        public ChomeDLC addAdblock() {
            this.adblock = true;
            return this;
        }

        public ChomeDLC addTalentAPI() {
            this.talentAPI = true;
            return this;
        }

        public Chrome builder() {
            return new Chrome(this);
        }
        
    }
    
            @Override
            public String toString() {
                return "Chrome [plugin=" + plugin + ", plugin2=" + plugin2 + ", plugin3=" + plugin3 + ", adblock=" + adblock
                        + ", talentAPI=" + talentAPI + "]";
            }
}
