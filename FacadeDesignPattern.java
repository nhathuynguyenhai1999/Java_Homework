package StructuralDesignPattern;

public class FacadeDesignPattern {
    public interface SocialShare {
        void setMessage(String message);
        void share();
    }
    static class Twitter implements SocialShare {
        private String message;
        @Override
        public void setMessage(String message) {
            this.message = message;
        }
        @Override
        public void share() {
            System.out.println("Sharing to Twitter: " + this.message);
        }
    }
    public static class Facebook implements SocialShare {
        private String message;
        @Override
        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public void share() {
            System.out.println("Sharing to Facebook: " + this.message);
        }
    }
    public static class LinkedIn implements SocialShare {
        private String message;
        @Override
        public void setMessage(String message) {
            this.message = message;
        }
        @Override
        public void share() {
            System.out.println("Sharing to LinkedIn: " + this.message);
        }
    }
    public static class SocialMediaFacade {
        private SocialShare twitter;
        private SocialShare facebook;
        private SocialShare linkedIn;
        public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedIn) {
            this.twitter = twitter;
            this.facebook = facebook;
            this.linkedIn = linkedIn;
        }
        public void share(String message) {
            this.twitter.setMessage(message);
            this.facebook.setMessage(message);
            this.linkedIn.setMessage(message);
            this.twitter.share();
            this.facebook.share();
            this.linkedIn.share();
        }
    }
    public static class Client {
        public void share(String message) {
            SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
            socialMediaFacade.share(message);
        }
    }
    public static void main(String[] args) {
        Client client = new Client();
        client.share("This is a post");
    }
}
