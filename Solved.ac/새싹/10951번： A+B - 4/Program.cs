/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10951                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10951                          #+#        #+#      #+#    */
/*   Solved: 2024/06/27 22:57:23 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
int a, b;

while(true)
{
    string input = Console.ReadLine();
    if (input == null)
        break;
    string[] num = input.Split();

    a = int.Parse(num[0]);
    b = int.Parse(num[1]);

    Console.WriteLine(a + b);
}