class Recursion {
    int display(int i,int sum) {
        if (i < 1)
            return sum; // base case
        return display(i - 1, sum + i); // recursive sum
    }

    public static void main(String[] args) {
        int n = 25;
        Recursion obj = new Recursion();
        int sum = obj.display(n, 0);
        System.out.println("Sum is: " + sum);
    }
}
