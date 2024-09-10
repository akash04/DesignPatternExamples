interface Observer {
    void update(String message);
}

//observer
class Follower implements Observer {
    private String name;

    public Follower(String name) {
        this.name = name;
    }

    //behiovour is been update
    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

//subject or publisher
class Influencer {
    private List<Observer> followers = new ArrayList<>();

    public void follow(Observer follower) {
        followers.add(follower);
    }

    public void notifyFollowers(String message) {
        for (Observer follower : followers) {
            follower.update(message);
        }
    }

    public void postUpdate(String message) {
        System.out.println("Influencer posted: " + message);
        notifyFollowers(message);
    }
}
