package builder_method_exersice;

public class Main {
    public static void main(String[] args) {
        computer gamingPC = new computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGPU("NVIDIA RTX 4080")
            .build();

        computer officePC = new computer.Builder()
            .setCPU("Intel i5")
            .setRAM("16GB")
            .setStorage("512GB SSD")
            .build();

        System.out.println(gamingPC);
        System.out.println(officePC);
    }
}