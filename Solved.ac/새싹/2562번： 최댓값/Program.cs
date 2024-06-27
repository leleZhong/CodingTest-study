/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2562                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2562                           #+#        #+#      #+#    */
/*   Solved: 2024/06/27 23:12:05 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
List<int> num = new List<int>();

for (int i = 0; i < 9; i++)
{
    int input = int.Parse(Console.ReadLine());
    num.Add(input);
}
    

int max = num.Max();
Console.WriteLine(max);
Console.WriteLine(num.IndexOf(max)+1);