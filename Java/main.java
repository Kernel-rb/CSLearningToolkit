public class Main {
    static class Info {
        String name;
        String info;
        String repo;

        public Info(String name, String info, String repo) {
            this.name = name;
            this.info = info;
            this.repo = repo;
        }
    }

    public static Info getRepoInfo(String repo) {
        return new Info("Java", "Soon", "WebMasterToolKit/Java");
    }

    public static void main(String[] args) {
        System.out.println(getRepoInfo("Java"));
    }
}

