/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 5597                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/5597                           #+#        #+#      #+#    */
/*   Solved: 2024/06/28 14:50:54 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
int[] input = new int[28];
List<int> list = new List<int>();

for (int i = 0; i < 28; i++)
{
    input[i] = int.Parse(Console.ReadLine());
}

for (int i = 1; i <= 30; i++)
{
    if (!Array.Exists(input, element => element == i))
    list.Add(i);
}

Console.WriteLine(list.Min());
Console.WriteLine(list.Max());