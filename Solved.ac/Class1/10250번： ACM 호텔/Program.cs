/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10250                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10250                          #+#        #+#      #+#    */
/*   Solved: 2024/06/28 17:24:08 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
using System.Text;

StringBuilder sb = new StringBuilder();
int t = int.Parse(Console.ReadLine());
for (int i = 0; i < t; i++)
{
    int[] input = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
    int h = input[0];
    int w = input[1];
    int n = input[2];
    
    int y = n % h;
    int x = n / h + 1;
    if (y == 0)
    {
        y = h;
        x -= 1;
    }
    
    int len = x.ToString().ToCharArray().Length;
    
    if (len == 1)
    {
        sb.Append(y);
        sb.Append(0);
        sb.Append(x);
    }
    else if(len == 2)
    {
        sb.Append(y);
        sb.Append(x);
    }
    sb.AppendLine();
}
Console.WriteLine(sb);