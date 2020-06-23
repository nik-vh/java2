package Marathon;
import java.util.Arrays;
import java.util.Random;

public class Team {
    protected String name;
    protected Competitor[] players;

    public Team (String name, Competitor... players) {
        this.name = name;
        this.players = players;
    }

    public Team() {
        players = new Competitor[4];
        Random random = new Random();
        String[] teamNames = {"Рэнжеры", "Пионеры", "Упыри", "Лузеры", "Гоньщики", "Бандиты", "Победители", "Спартак", "Динамо"};
        this.name = teamNames[random.nextInt(9)];
        //random 1- Cat 2-Dog 3-Human
        for (int i = 0; i < players.length; i++) {
            int who = random.nextInt(3);
            if(who == 1) {
                this.players[i] = new Cat();
            } else if (who == 2) {
                this.players[i] = new Dog();
            } else {
                this.players[i] = new Human();
            }
        }
    }


    public void showResults() {
        System.out.println("=======================================");
        System.out.println("В соревновании победили:");
        for(Competitor p: players) {
            if(p.isOnDistance()) {
                p.info();
            }
        }
    }

    public void infoPlayers() {
        System.out.println(Arrays.toString(players));
    }

    public void infoName() {
        System.out.println(name);
    }

    public Competitor[] getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }
}
