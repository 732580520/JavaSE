public class birthday {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String birthStr=sc.next();
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            Date birthDate = sdf.parse(birthStr);
//            Date nowDate=new Date();
//            long l = nowDate.getTime() - birthDate.getTime();
//            System.out.println(l / 1000 / 60 / 60 / 24);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        int real=m1();
        System.out.println(real);
    }

    private static int m1() {
        int i=100;
        try {
            return i;
        }finally {
            i++;
        }
    }
}
