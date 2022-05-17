class MinStack {
private int[] arr = new int[100];
private int index = -1;
public void push(int x) {
if(index == arr.length - 1){
arr = Arrays.copyOf(arr, arr.length*2);
}
arr[++index] = x;
}
public void pop() {
if(index>-1){
if(index == arr.length/2 && arr.length > 100){
arr = Arrays.copyOf(arr, arr.length/2);
}
index--;
}
}
public int top() {
if(index > -1){
return arr[index];
}else{
return 0;
}
}
public int getMin() {
int min = Integer.MAX_VALUE;
for(int i=0; i<=index; i++){
if(arr[i] < min)
min = arr[i];
}
return min;
}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */