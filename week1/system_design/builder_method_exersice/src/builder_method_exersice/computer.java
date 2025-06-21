package builder_method_exersice;

//Computer.java
public class computer {
 private String CPU;
 private String RAM;
 private String storage;
 private String GPU;

 private computer(Builder builder) {
     this.CPU = builder.CPU;
     this.RAM = builder.RAM;
     this.storage = builder.storage;
     this.GPU = builder.GPU;
 }

 public static class Builder {
     private String CPU;
     private String RAM;
     private String storage;
     private String GPU;

     public Builder setCPU(String CPU) {
         this.CPU = CPU;
         return this;
     }

     public Builder setRAM(String RAM) {
         this.RAM = RAM;
         return this;
     }

     public Builder setStorage(String storage) {
         this.storage = storage;
         return this;
     }

     public Builder setGPU(String GPU) {
         this.GPU = GPU;
         return this;
     }

     public computer build() {
         return new computer(this);
     }
 }

 public String toString() {
     return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + ", GPU=" + GPU + "]";
 }
}
