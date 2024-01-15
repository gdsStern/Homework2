public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var result2 = dog - 4;
        var result22 = cat - 4;
        var result222 = paper - 4;
        System.out.println(result2);
        System.out.println(result22);
        System.out.println(result222);

        var result3 = dog - 3.5;
        var result33 = cat - 1.6;
        var result333 = paper - 7639;
        System.out.println(result3);
        System.out.println(result33);
        System.out.println(result333);

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

        var pl1Weight = 78.2;
        var pl2Weight = 82.7;
        var result6 = pl1Weight + pl2Weight;
        var result66 = pl1Weight - pl2Weight;
        System.out.println(result6);
        System.out.println(result66);

        var result7 = pl2Weight - pl1Weight;
        var result77 = pl2Weight % pl1Weight;

        var totalHours = 640;
        var hoursPerPerson = 8;
        var totalPerson = totalHours / hoursPerPerson;
        System.out.println("Всего работников в компании — " + totalPerson + " человек");

        var totalPeron2 = totalPerson + 94;
        var totalHours2 = totalPeron2 * hoursPerPerson;
        System.out.println("Если в компании работает " + totalPeron2 + " человек, то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками");

    }
}