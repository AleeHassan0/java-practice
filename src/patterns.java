public class patterns {

    // outer loop rows
    // inner loop coloumns
   public static void main(String[] args) {

////for loop ex.1
    // for(int i=0;i<4;i++){
    //     for(int j=0;j<4;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


////hollow rectangle with the help of nested loop
// int n=4;
// int m=5;
// for (int i=1;i<=n;i++){
//     for(int j=1;j<=m;j++){
//   if(i==1||j==1||i==n||j==m){
//     System.out.print("*");
// } else {
//     System.out.print(" ");
// }
//     }
//     System.out.println();
// }


////half pyramid
// int n=4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

int n=4;

//inveted pyramid
for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}






   }
}
