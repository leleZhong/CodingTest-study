/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2675                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2675                           #+#        #+#      #+#    */
/*   Solved: 2024/06/27 23:17:26 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
int t = int.Parse(Console.ReadLine());
for (int i = 0; i < t; i++)
{
    string[] input = Console.ReadLine().Split(" ");
    int r = int.Parse(input[0]);
    char[] s = input[1].ToCharArray();

    for(int j = 0; j < s.Length; j++)
        for (int k = 0; k < r; k++)
            Console.Write(s[j]);
    
    Console.WriteLine();
}