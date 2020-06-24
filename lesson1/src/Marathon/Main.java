package Marathon;

public class Main {
    public static void main (String... args) {
        //Cat cat = new Cat();
        //cat.info();
        //Dog dog = new Dog();
        //dog.info();
        //Human human = new Human();
        //human.info();

        //Competitor[] competitors = {new Human(), new Cat(), new Dog()};
        //Obstacle[] course = {new Cross(), new Water(), new Wall(), new Cross()};
        //System.out.println("Длинна кроса - " + course[0].getValue());
        //System.out.println("Длинна заплыва - " + course[1].getValue());
        //System.out.println("Высота стены - " + course[2].getValue());
        //System.out.println("Длинна кроса - " + course[3].getValue());
        //for (Competitor c : competitors) {
        //    for (Obstacle o : course) {
        //        o.doIt(c);
        //        if (!c.isOnDistance()) break;
        //    }
       // }
        //for (Competitor c : competitors) {
        //    c.info();
        //}
        //Team team = new Team();
        //team.infoName();
        //team.infoPlayers();

        //Course course = new Course();
        //course.infoObstacles();

        Course randomCourse = new Course();
        Team randomTeam = new Team();
        randomCourse.doIt(randomTeam);
        randomTeam.showResults();
        Team team = new Team("Rocket", new Human("Bob"), new Cat("Vaska"), new Dog("Bobik"));
        Course course = new Course(new Cross(80), new Wall(2), new Wall(1), new Cross(120));
        course.doIt(team);
        team.showResults();
    }
}
