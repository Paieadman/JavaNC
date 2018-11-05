public enum Alcohol {
        WHISKEY, COGNAC, VODKA, BEER, ABSENT;
        public void findEnum(Alcohol alc){
            long startTime = System.nanoTime();
            if(alc == Alcohol.WHISKEY){
                System.out.println(System.nanoTime() - startTime);
            } else{
                if(alc == Alcohol.COGNAC){
                    System.out.println(System.nanoTime() - startTime);
                } else{
                    if(alc == Alcohol.VODKA){
                        System.out.println(System.nanoTime() - startTime);
                    } else{
                        if(alc == Alcohol.BEER){
                            System.out.println(System.nanoTime() - startTime);
                        } else{
                            if(alc == Alcohol.ABSENT){
                                System.out.println(System.nanoTime() - startTime);
                            }
                        }
                    }
                }
            }

        }
        public void findEnumSwitch(Alcohol alc){
            long startTime = System.nanoTime();
            switch (alc){
                case BEER: {System.out.println(System.nanoTime() - startTime); break;}
                case VODKA: {System.out.println(System.nanoTime() - startTime); break;}
                case ABSENT: {System.out.println(System.nanoTime() - startTime);break;}
                case COGNAC: {System.out.println(System.nanoTime() - startTime);break;}
                case WHISKEY: {System.out.println(System.nanoTime() - startTime);break;}
            }
        }
}
