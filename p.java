public class p {

   int i,j,count;
   for(i=0;i<10;i++)
    {
        if (i == 0 || i == 1) {
            continue;
        }
        count = 1;
        for (j = 2; j < i; j++) {
            if (i % j == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.print("%d "+ i);

        }
    }

    return 0;
}