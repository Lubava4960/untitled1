public class Main {
    public static void main(String[] args) {
        int beg =27897;
        byte dog =67;
        System.out.println(dog);
        short hous=-159;
        System.out.println(hous);
        long cat=987678965549L;

        System.out.print(cat);
        double bigHous=5.786;
        System.out.println(bigHous);
        double wings=27.12;
        System.out.println(wings);
        char bar=43;
        System.out.println(bar);
        float b =35 ;
        System.out.println(b);
        int studentl =23;
        System.out.println(studentl);
        int studentA=27;
        System.out.println(studentA);
        int studentE=30;
        System.out.println(studentE);
        int allStudent=(studentl+studentE+studentA);
        System.out.println(allStudent);
        int allPaper=480;
        int student1=(allPaper/allStudent);
        System.out.println("На каждого ученика рассчитано "+student1+ " листов бумаги ");
        int one = 2;
        int bottle=16;
        int oneMin=(bottle/one);
        System.out.println("В минуту  машина производит " +oneMin+ " бутылок ");
        int twenty=20;
        int forTwenty=(oneMin*twenty);
        System.out.println("За 20 минут машина производит "+ forTwenty+ " бутылок");
        int oneDay=24;
        int oneHous=60;
        int allHousMin=(oneDay*oneHous);
        System.out.println("всего в сутках "+allHousMin+ " минут");
        int oneDayBottle=(allHousMin*oneMin);
        System.out.println("Машина производит за 24 часа " + oneDayBottle+ " бутылок");
        int threeDay = 3;
        int threeDaymin =(oneDayBottle*threeDay);
        System.out.println(threeDaymin);
        System.out.println(" За трое суток машина производит " + threeDaymin+ " бутылок");
        int thirty =30;
        int mounsBattele=(thirty*oneDayBottle);
        System.out.println("За месяц машина производит " +mounsBattele+ " бутылок");

        byte allDya=120;
        byte wight=2;
        byte broun=4;
        int oneClass=(wight+broun);
        System.out.println(oneClass);
        int allClass=(allDya/oneClass);
        System.out.println(allClass);
        int allWight=(allClass*wight);
        int allBroun=(allClass*broun);
        System.out.println(" В школе, где " + allClass+ " классов, нужно " + allWight+ " банок белой краски и  " + allBroun+ " банок коричневой краски. ");
        int banana = 5;
        int weghtBanana =80;
        int allBanana=(banana*weghtBanana);
        System.out.println(allBanana);
        int Milk = 200;
        int weghtMilk=105;
        int allmilk=(105*2);
        System.out.println(allmilk);
        int icecream=2;
        int weghtIcream=100;
        int allIcecream=(icecream*weghtIcream);
        System.out.println(allIcecream);
        int eggs=4;
        int weghtEgg=70;
        int allEggs=(eggs*weghtEgg);
        System.out.println(allEggs);
        int brekfast=(allBanana+allmilk+allIcecream+allEggs);
        System.out.println(brekfast);
        double weight=1000;
        double breakfast=(brekfast/weight);
        System.out.println("Вес спорт-завтрака " +breakfast+ " кг");
        int goal=7;
        int gram=1000;
        int gramGoal=(goal*gram);
        System.out.println(gramGoal);
        int dayOne=250;
        int tooDay=500;
        int oneDays=(gramGoal/dayOne);
        System.out.println("Если спортсмен будет терять в день по " +dayOne+ "грамм, то понадобится "+oneDays+ " дней ");
        int tooDays=(gramGoal/tooDay);
        System.out.println("Если спортсмен будет терять в день по "+tooDay+ " грамм, то понадобится "+tooDays+ " дней ");
        int allDays= (oneDays+tooDays);
        System.out.println(allDays);
        int difference = (oneDays+tooDays)%allDays;
        System.out.println(difference);
        int averageDay=(allDays/2);
        System.out.println(" В среднем для похудения поднадобится " +averageDay+ "день ");

        int wageM=67760;
        int pers=10;
        int newM=(wageM*pers)/100+(wageM);
        int year=12;
        int oldYearM=(wageM*year);
        System.out.println(oldYearM);
        int newYearM=(newM*year);
        System.out.println(newYearM);
        int differenсеYearM=(newYearM-oldYearM);
        System.out.println(differenсеYearM);

        System.out.print("Новая зарплата Маши " +newM+ " рублей и годовой доход Маши увеличился на " +differenсеYearM+ "рублей. ");
        int wageD=83690;
        int newD=(wageD*pers)/100+wageD;
        int oldYearD=(wageD*year);
        System.out.println(oldYearD);
        int newYearD=(newD*year);
        System.out.println(newYearD);
        int differenсеYearD=(newYearD-oldYearD);
        System.out.println(differenсеYearD);
        System.out.println("Новая зарплата Дениса "+newD+ " рублей, а годовой доход увеличился на "+differenсеYearD+ " рублей. ");
        int wageK=76230;
        int newK=(wageK*pers)/100+wageK;
        int olldYearK=(wageK*year);
        int newYearK=(newK*year);
        System.out.println(newK);
        int differenсеK=(newYearK-olldYearK);
        System.out.println("новая зарплата Кристины "+newK+ " рублей,  годовой доход увеличился на  " + differenсеK+ " рублей.");




    }
}