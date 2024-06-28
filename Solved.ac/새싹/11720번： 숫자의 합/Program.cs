/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11720                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11720                          #+#        #+#      #+#    */
/*   Solved: 2024/06/28 16:35:17 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
int n = int.Parse(Console.ReadLine());
char[] input = Console.ReadLine().ToCharArray();
int[] num = Array.ConvertAll(input, c => int.Parse(c.ToString()));
int sum = 0;

for (int i = 0; i < n; i++)
{
    sum += num[i];
}
Console.WriteLine(sum);