package enums;

enum Website {
    FB("https://facebook.com/"),
    TW("https://twitter.com/"),
    IG("https://instagram.com/"),
    YT("https://youtube.com/"),
    GG("https://google.com/");
    private final String url;

    Website(String envUrl) {
        this.url = envUrl;
    }

    public String getUrl() {
        return url;
    }
}