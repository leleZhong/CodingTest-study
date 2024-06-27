/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2739                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2739                           #+#        #+#      #+#    */
/*   Solved: 2024/06/27 17:07:21 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
string input = Console.ReadLine();
int n = int.Parse(input);

for (int i = 1; i <= 9; i++)
{
    Console.WriteLine(n + " * " + i + " = " + n*i);
}