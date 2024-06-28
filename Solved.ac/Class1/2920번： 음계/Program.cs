/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2920                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2920                           #+#        #+#      #+#    */
/*   Solved: 2024/06/28 18:41:09 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
int[] input = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
bool flag = false;

if (input[0] == 1)
{
    for (int i = 1; i <= 8; i++)
    {
        if (flag = Detect(i-1, i))
            break;
    }
    if (flag)
        Console.WriteLine("mixed");
    else
        Console.WriteLine("ascending");
}
else if (input[0] == 8)
{
    for (int i = 8; i >= 1; i--)
    {
        if (flag = Detect(8-i, i))
            break;
    }
    if (flag)
        Console.WriteLine("mixed");
    else
        Console.WriteLine("descending");
}
else
    Console.WriteLine("mixed");

bool Detect(int index, int value)
{
    if (input[index] != value)
        return true;
    return false;
}