public class main {

    public static void main(String[] args) {

        //int[] numbers = new int[5];
        //Dad[] dads = new Dad[3];
        //Mom[] moms = new Mom[3];
        //Kid[] kids= new Kid[3];


        Person[] family= new Person[4];

        for (int i=0;i< family.length;i++){
            if (i==0){
            family[i]= new Dad("arenostu","bar",55,
                    "052648945107","bodek tochna","ioniq");
            }
            if (i==1){
                family[i]  = new Mom("michal",family[0].lname,189,
                        "0584848964","zara","ceo tnova");
            }
            if (i>1){
                family[i] = new Kid("hodi",family[0].lname, 889 + i,
                        "051856486", "8 ball pool", 11);
            }
        }

        for (Person p:family) {
            System.out.println(p);
            p.WhatAreYouDoing();
            if( p instanceof Dad) {
                System.out.println(((Dad) p).work);
            }
            if (p instanceof Kid){
                System.out.println(((Kid) p).play +" is a great game");
            }

        }


        Mom mom13= new Mom("maria","ecom",174754,
                "7085787898","mango","taxi driver");
        ((Person)mom13).WhatAreYouDoing();
        System.out.println();








       /* Dad dad1= new Dad("arenostu","bar",55,"052648945107","bodek tochna","ioniq");
        Mom mom1 = new Mom("michal",dad1.lname,189,"0584848964","zara","ceo tnova");
        Kid kid1 = new Kid("hodi", dad1.lname,889,"051856486","8 ball pool",11 );
        Kid kid2 = new Kid("enrique", dad1.lname,889,"0486940147","fortnite",9 );

        System.out.println(dad1);
        dad1.WhatAreYouDoing();
        System.out.println(mom1);
        mom1.WhatAreYouDoing();
        System.out.println(kid1);
        kid1.WhatAreYouDoing();
        System.out.println(kid2);
        kid2.WhatAreYouDoing();*/


    }
}
