/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10950                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10950                          #+#        #+#      #+#    */
/*   Solved: 2024/06/27 17:11:06 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
int t = int.Parse(Console.ReadLine());
int[] output = new int[t];

for (int i = 0; i < t; i++)
{
    string[] input = Console.ReadLine().Split();
    int a = int.Parse(input[0]);
    int b = int.Parse(input[1]);
    output[i] = a + b;
}

for (int i = 0; i < t; i++)
{
    Console.WriteLine(output[i]);
}