public class BuilderDBExample {
}
class DbConnect {
    private String url;
    private Srting username;
    private String password;
    private int minConenction;
    private int maxConnection;

    public static class Builder {
        private String url;
        private Srting username;
        private String password;
        private int minConenction;
        private int maxConnection;

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder username(Srting username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }
        public Builder minConenction(Int minConenction) {
            this.minConenction = minConenction;
            return this;
        }
        public Builder maxConenction(Int maxConenction) {
            this.maxConenction = maxConenction;
            return this;
        }

        public DbConnect build() {
            DbConnect dbc = new DbConnect();
            dbc.url = this.url;
            dbc.username = this.username;
            dbc.password = this.password;
            dbc.minConenction=this.minConenction;
            dbc.maxConenction=this.maxConenction;
            return dbc;
        }
    }

    @Override
    public String toString() {
        return "DbConnect{" +
                "url='" + url + '\'' +
                ", username=" + username +
                ", password='" + password + '\'' +
                ", minConenction='" + minConenction + '\'' +
                ", maxConenction='" + maxConenction + '\'' +
                '}';
    }
}