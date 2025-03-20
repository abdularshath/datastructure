/******************************************************************************

array insert element at any position by specifying the position index:

*******************************************************************************/
#include <stdio.h>

int main()
{
    int n,ind,val;
    scanf("%d",&n);
    int a[n+1];
    scanf("%d",&ind);
    scanf("%d",&val);
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    
    for(int i=0;i<n;i++){
        printf("%d",a[i]);
    }

    printf("\nafter insertion:\n");
    for(int i=n;i>=ind;i--){
        a[i]=a[i-1];
    }
    a[ind]=val;
    for(int i=0;i<=n;i++){
        printf("%d",a[i]);
    }
    return 0;
}
