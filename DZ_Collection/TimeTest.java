import java.util.*;

public class TimeTest {
    public static String job() {
        String str = "        AL         LL";
        str+= System.lineSeparator();
        str+= "AL"+ System.lineSeparator();
        str=experimentsAL(str);

        str+= System.lineSeparator();
        str+= "LL"+ System.lineSeparator();
        str=experimentsLL(str);

        str+= System.lineSeparator();
        str+= "HS"+ System.lineSeparator();
        str=experimentsHS(str);

        str+= System.lineSeparator();
        str+= "LHS"+ System.lineSeparator();
        str=experimentsLHS(str);

        str+= System.lineSeparator();
        str+= "TS"+ System.lineSeparator();
        str=experimentsTS(str);

        str+= System.lineSeparator();
        str+= "HM"+ System.lineSeparator();
        str=experimentsHM(str);

        str+= System.lineSeparator();
        str+= "LHM"+ System.lineSeparator();
        str=experimentsLHM(str);

        str+= System.lineSeparator();
        str+= "TM"+ System.lineSeparator();
        str=experimentsTM(str);


        str+=System.lineSeparator();
        str+="На основе полученных данных можно сделать вывод, что ArrayList лучше при использовании доступа по индексу и "+System.lineSeparator() +
                "при добавлении в конец, а если нужно много раз вставлять элементы в середину лучше воспользоваться LinkedList."+System.lineSeparator() +
                " Особенность TreeSet - сортировка при каждой вставке, поэтому он работает медленнее, LinkedHashSet - "+System.lineSeparator() +
                "на втором месте по вставке, а HashSet - самый быстрый, при поиске элемента и получении значения по индексу"+System.lineSeparator() +
                "TreeMap хорош при сортировке, LinkedHashMap выигрывает у HashMap при вставке в середину";
        return str;
    }

    public static String experimentsAL(String str){
        str+= "add      size    set"+System.lineSeparator();
        str+= addAL()+ " ";
        str+= sizeAL()+ " ";
        str+= setAL()+ " ";
        return str;
    }

    public static String experimentsLL(String str){
        str+= "add      size    set"+System.lineSeparator();
        str+= addLL()+ " ";
        str+= sizeLL()+ " ";
        str+= setLL()+ " ";
        return str;
    }

    public static String experimentsHS(String str){
        str+= "add      size    get"+System.lineSeparator();
        str+= addHS()+ " ";
        str+= sizeHS()+ " ";
        str+= getHS()+ " ";
        return str;
    }

    public static String experimentsLHS(String str){
        str+= "add      size     get "+System.lineSeparator();
        str+= addLHS()+ " ";
        str+= sizeLHS()+ " ";
        str+= getLHS()+ " ";
        return str;
    }

    public static String experimentsTS(String str){
        str+= "add      size     get"+System.lineSeparator();
        str+= addTS()+ " ";
        str+= sizeTS()+ " ";
        str+= getTS()+ " ";
        return str;
    }

    public static String experimentsHM(String str){
        str+= "put      size    get"+System.lineSeparator();
        str+= putHashMap()+ " ";
        str+= sizeHashMap()+ " ";
        str+= getHashMap()+ " ";
        return str;
    }

    public static String experimentsLHM(String str){
        str+= "put      size    get"+System.lineSeparator();
        str+= putLHM()+ " ";
        str+= sizeLHM()+ " ";
        str+= getLHM()+ " ";
        return str;
    }

    public static String experimentsTM(String str){
        str+= "put      size    get"+System.lineSeparator();
        str+= putTM()+ " ";
        str+= sizeTM()+ " ";
        str+= getTM()+ " ";
        return str;
    }


    public static long addAL(){
        ArrayList<Integer> al= new ArrayList<Integer>();
        long startTime = System.nanoTime();
        for(int i = 0; i<10000; i++){
            al.add(0);
        }
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long getAL(){
        ArrayList<Integer> al= new ArrayList<Integer>();

        for(int i = 0; i<10000; i++){
            al.add(0);
        }
        long startTime = System.nanoTime();

        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long getLL(){
        LinkedList<Integer> al= new LinkedList<Integer>();

        for(int i = 0; i<10000; i++){
            al.add(0);
        }
        long startTime = System.nanoTime();
        al.get(9999);
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long addLL(){
        LinkedList<Integer> al= new LinkedList<Integer>();
        long startTime = System.nanoTime();
        for(int i = 0; i<10000; i++){
            al.add(0);
        }
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long sizeAL(){
        ArrayList<Integer> al= new ArrayList<Integer>();

        for(int i = 0; i<10000; i++){
            al.add(0);
        }
        long startTime = System.nanoTime();
        al.size();
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long sizeLL(){
        LinkedList<Integer> al= new LinkedList<Integer>();

        for(int i = 0; i<10000; i++){
            al.add(0);
        }
        long startTime = System.nanoTime();
        al.size();
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long mean(long[] arr){
        int mean = 0;
        for (long i: arr){
            mean += i;
        }
        return (long)(mean/arr.length);
    }

    public static long setAL(){
        ArrayList<Integer> al= new ArrayList<Integer>();

        for(int i = 0; i<10000; i++){
            al.add(0);
        }
        long startTime = System.nanoTime();
        al.set(9999,1);
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long setLL(){
        LinkedList<Integer> al= new LinkedList<Integer>();

        for(int i = 0; i<10000; i++){
            al.add(0);
        }
        long startTime = System.nanoTime();
        al.set(9999,1);
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long addHS(){
        HashSet<Integer> al= new HashSet<>();
        long startTime = System.nanoTime();
        for(int i = 0; i<10000; i++){
            al.add(i);
        }
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long sizeHS(){
        HashSet<Integer> al= new HashSet<>();

        for(int i = 0; i<10000; i++){
            al.add(i);
        }
        long startTime = System.nanoTime();
        al.size();
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long getHS(){
        HashSet<Integer> al= new HashSet<>();
        for(int i = 0; i<10000; i++){
            al.add(i);
        }
        long startTime = System.nanoTime();
        al.contains(9999);
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long getTS(){
        TreeSet<Integer> al= new TreeSet<>();
        for(int i = 0; i<10000; i++){
            al.add(i);
        }
        long startTime = System.nanoTime();
        al.contains(9999);
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long getLHS(){
        LinkedHashSet<Integer> al= new LinkedHashSet<>();
        for(int i = 0; i<10000; i++){
            al.add(i);
        }
        long startTime = System.nanoTime();
        al.contains(9999);
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long addLHS(){
        LinkedHashSet<Integer> al= new LinkedHashSet<>();
        long startTime = System.nanoTime();
        for(int i = 0; i<10000; i++){
            al.add(i);
        }
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long sizeLHS(){
        LinkedHashSet<Integer> al= new LinkedHashSet<>();

        for(int i = 0; i<10000; i++){
            al.add(i);
        }
        long startTime = System.nanoTime();
        al.size();
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long addTS(){
        TreeSet<Integer> al= new TreeSet<>();
        long startTime = System.nanoTime();
        for(int i = 0; i<10000; i++){
            al.add(i);
        }
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long sizeTS(){
        TreeSet<Integer> al= new TreeSet<>();

        for(int i = 0; i<10000; i++){
            al.add(i);
        }
        long startTime = System.nanoTime();
        al.size();
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long putHashMap(){
        HashMap<Integer, Integer> al= new HashMap<>();
        long startTime = System.nanoTime();
        for(int i = 0; i<10000; i++){
            al.put(i,i);
        }
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long sizeHashMap(){
        HashMap<Integer, Integer> al= new HashMap<>();
        for(int i = 0; i<10000; i++){
            al.put(i,i);
        }
        long startTime = System.nanoTime();
        al.size();
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long getHashMap(){
        HashMap<Integer, Integer> al= new HashMap<>();
        for(int i = 0; i<10000; i++){
            al.put(i,i);
        }
        long startTime = System.nanoTime();
        al.get(9999);
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long putLHM(){
        LinkedHashMap<Integer, Integer> al= new LinkedHashMap<>();
        long startTime = System.nanoTime();
        for(int i = 0; i<10000; i++){
            al.put(i,i);
        }
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }
    public static long sizeLHM(){
        LinkedHashMap<Integer, Integer> al= new LinkedHashMap<>();
        for(int i = 0; i<10000; i++){
            al.put(i,i);
        }
        long startTime = System.nanoTime();
        al.size();
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }
    public static long getLHM(){
        LinkedHashMap<Integer, Integer> al= new LinkedHashMap<>();
        for(int i = 0; i<10000; i++){
            al.put(i,i);
        }
        long startTime = System.nanoTime();
        al.get(9999);
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long putTM(){
        TreeMap<Integer, Integer> al= new TreeMap<>();
        long startTime = System.nanoTime();
        for(int i = 0; i<10000; i++){
            al.put(i,i);
        }
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }


    public static long sizeTM(){
        TreeMap<Integer, Integer> al= new TreeMap<>();
        for(int i = 0; i<10000; i++){
            al.put(i,i);
        }
        long startTime = System.nanoTime();
        al.size();
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }

    public static long getTM(){
        TreeMap<Integer, Integer> al= new TreeMap<>();
        for(int i = 0; i<10000; i++){
            al.put(i,i);
        }
        long startTime = System.nanoTime();
        al.get(9999);
        long estimatedTime = System.nanoTime() - startTime;
        return estimatedTime;
    }


}
