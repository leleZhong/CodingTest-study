/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2480                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2480                           #+#        #+#      #+#    */
/*   Solved: 2024/06/26 23:01:21 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
string[] input = Console.ReadLine().Split(' ');
int[] num = Array.ConvertAll(input, c => int.Parse(c));

if (num[0] == num[1] && num[0] == num[2])
    Console.WriteLine(10000 + num[0] * 1000);
else if (num[0] == num[1] || num[0] == num[2])
    Console.WriteLine(1000 + num[0] * 100);
else if (num[1] == num[2])
    Console.WriteLine(1000 + num[1] * 100);
else
    Console.WriteLine(MathF.Max(num[0], MathF.Max(num[1], num[2])) * 100);