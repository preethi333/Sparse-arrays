
/* Sparse array
 *@author:preethi
*/

 static int[] matchingStrings(String[] strings, String[] queries) {
        int l=strings.length;
        int q=queries.length;
        int[] a=new int[q];
        for(int i=0;i<q;i++){
            a[i]=0;
        }
        for(int i=0;i<l;i++){
           for(int j=0;j<q;j++){
               if(strings[i].equals(queries[j])){
                  a[j]++;
               }
           }
        }
     return a;
    }