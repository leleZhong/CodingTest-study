/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2738                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2738                           #+#        #+#      #+#    */
/*   Solved: 2024/06/28 15:23:04 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
using System.Text;

int[] nm = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
int[,] a = new int[nm[0], nm[1]];
int[,] b = new int[nm[0], nm[1]];
StringBuilder sb = new StringBuilder();

for (int k = 0; k < 2; k++)
{
    for (int i = 0; i < nm[0]; i++)
    {
        int[] rowValues = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
        for (int j = 0; j < nm[1]; j++)
        {
            if (k == 0)
                a[i, j] = rowValues[j];
            if (k == 1)
                b[i, j] = rowValues[j];
        }
    }
}
for (int i = 0; i < nm[0]; i++)
{
    for (int j = 0; j < nm[1]; j++)
    {
        sb.Append($"{a[i, j] + b[i, j]} ");
    }
    sb.Append("\n");
}
Console.WriteLine(sb);