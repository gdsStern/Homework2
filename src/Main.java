public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 4;
        cat = cat - 4;
        paper = paper - 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var bothFightersWeight = firstFighterWeight + secondFighterWeight;
        var result66 = firstFighterWeight - secondFighterWeight;
        System.out.println(bothFightersWeight);
        System.out.println(result66);

        var result7 = secondFighterWeight - firstFighterWeight;
        var result77 = secondFighterWeight % firstFighterWeight;

        var totalHours = 640;
        var hoursPerPerson = 8;
        var totalPerson = totalHours / hoursPerPerson;
        System.out.println("Всего работников в компании — " + totalPerson + " человек");

        var totalPeron2 = totalPerson + 94;
        var totalHours2 = totalPeron2 * hoursPerPerson;
        System.out.println("Если в компании работает " + totalPeron2 + " человек, то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками");

    }
}