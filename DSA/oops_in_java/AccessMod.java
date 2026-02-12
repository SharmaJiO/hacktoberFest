class AccessMod {
    static class parent{
        public int A = 10;
        protected int B = 20;
        int C = 30; //default
        private int D = 40;
    }

    static class child extends parent{
        child(){
            System.out.println(super.A);
            System.out.println(super.B);
            System.out.println(super.C);
            System.out.println(super.D); 
        }
    }
    public static void main(String args[]){
        child A = new child();
    }
}
