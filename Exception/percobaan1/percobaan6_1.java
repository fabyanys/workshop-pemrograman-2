class percobaan6_1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100;
        } catch (Exception e) {
            System.out.println("Anda mengakses indeks di luar batas array");
        }
    }
}