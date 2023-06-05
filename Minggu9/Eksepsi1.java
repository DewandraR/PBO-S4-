public class Eksepsi1 {

    public static void main(String[] args) {
        try {
            int arr[] = new int[10];
            arr[10] = 25; //Cara memperbaiki ubah arr 9
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi eksepsi: " + e.getMessage());
        }

    }

}