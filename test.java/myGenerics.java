public class myGenerics <T>{
    public T value;

   myGenerics(T value) {
       this.value = value;
   }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
