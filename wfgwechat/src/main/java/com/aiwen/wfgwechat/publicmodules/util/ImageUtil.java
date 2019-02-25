package com.aiwen.wfgwechat.publicmodules.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImageUtil {

    /**
     * 解析文章获取文章图片的url
     * @param htmlStr
     * @return
     */
    public static List<String> getImgStr(String htmlStr){
       /* String img="";
        Pattern p_image;
        Matcher m_image;
        List<String> pics = new ArrayList<String>();
        String regEx_img = "<img.*src\\s*=\\s*(.*?)[^>]*?>"; //图片链接地址
        //String regEx_img = "<img.*src=(.*?)[^>]*?>";
        p_image = Pattern.compile(regEx_img,Pattern.CASE_INSENSITIVE);
        m_image = p_image.matcher(htmlStr);
        while(m_image.find()){
            img = img + "," + m_image.group();      //个人觉得这句没用
            //Matcher m  = Pattern.compile("src=\"?(.*?)(\"|>|\\s+)").matcher(img); //匹配src
            Matcher m  = Pattern.compile("src=\"?(.*?)(\"|>|\\s+)").matcher(img);
            while(m.find()){
                pics.add(m.group(1));
            }
        }
        return pics;*/
        String img = "";
        Pattern p_image;
        Matcher m_image;
        List<String> pics = new ArrayList<String>();
//		 String regEx_img = "<img.*src=(.*?)[^>]*?>"; //图片链接地址
        String regEx_img = "<img.*src\\s*=\\s*(.*?)[^>]*?>";
        p_image = Pattern.compile(regEx_img, Pattern.CASE_INSENSITIVE);
        m_image = p_image.matcher(htmlStr);
        while (m_image.find()) {
            img = img + "," + m_image.group();
            // Matcher m =
            // Pattern.compile("src=\"?(.*?)(\"|>|\\s+)").matcher(img); //匹配src
            Matcher m = Pattern.compile("src\\s*=\\s*\"?(.*?)(\"|>|\\s+)").matcher(img);
            while (m.find()) {
                pics.add(m.group(1));
            }
        }
        return pics;

    }
    public static void main(String[] arg){
        String str ="据马来西亚《中国报》16日报道，马水源、土地与天然资源部长泽维尔声称，该国人民对政府花大钱养熊猫非常不满，要求提前把熊猫送回中国。</p ><p><img src='http://apps.lianziapp.com:8081/dfs/downloadpicture?sp=5&id=b7967a4528bc22f22038adbb8075d545' alt=''><img src='http://apps.lianziapp.com:8081/dfs/downloadpicture?sp=5&id=87fb2d559f36df143fff9389e4da35f1' alt='▲泽维尔'>▲泽维尔</p ><p>　　这意味着，旅居该国已4年半的熊猫“兴兴”和“靓靓”可能会提早回家。</p ><p><img src='http://apps.lianziapp.com:8081/dfs/downloadpicture?sp=5&amp;id=755ad1cd251c10c7132a2184f978b42a' alt='▲马来西亚吉隆坡，大熊猫“靓靓”正在吃竹子。'>▲马来西亚吉隆坡，大熊猫“靓靓”正在吃竹子。</p ><p>　　马来西亚媒体称，“兴兴”和“靓靓”在2015年8月诞下首只熊猫宝宝“暖暖”后，动物园的管理人员就曾“叫苦”称，熊猫馆的收入在扣除每个月的营运成本、饲料费用、员工成本、保安和维修费等成本后，收入很难负荷租金和保险费。所以动物园不打算向中国申请延长租借“暖暖”。</p ><p><img src='http://apps.lianziapp.com:8081/dfs/downloadpicture?sp=5&amp;id=930053c1a071894d382389dbbf0bc180' alt='▲“暖暖”在和妈妈“靓靓”玩耍。'>▲“暖暖”在和妈妈“靓靓”玩耍。</p ><p>　　但是，这番抱怨遭到时任资源与环境部长指责，称国家动物园不应擅作主张，在未与该部讨论前就表示不打算向中国申请延长有关租借期限。据马媒消息，“暖暖”已于2017年11月返回中国。</p ><p>< img src='http://apps.lianziapp.com:8081/dfs/downloadpicture?sp=5&amp;id=552ef6dbb2c091c38041cfabd4ce7776' alt='▲“暖暖”搭乘飞机回中国。'>▲“暖暖”搭乘飞机回中国。</p ><p>　　而这一次，马方要把“兴兴”和“靓靓”也送回中国的消息一出，不少马来西亚网友不干了。</p ><p>　　参考视频查阅社交媒体留言发现，大部分人都不赞同“民众不满养熊猫花钱多”的说辞。</p ><p>　　“没听说啊！”“我们怎么会不满意养熊猫？”</p ><p>< img src='http://apps.lianziapp.com:8081/dfs/downloadpicture?sp=5&amp;id=4dd72fb0aa42ccd7e75331e0b5e923d1' alt=''></p ><p>　　在不少网友看来，明明是动物园的运营有问题，却让大熊猫“背锅”。</p ><p>　　有网友直言：这么珍贵的熊猫“别国想要都没有，你们不善经营却怪熊猫！”&nbsp;</p ><p>　　还有人一针见血地指出：“不懂经营送你一颗摇钱树，送你一个聚宝盆也是徒劳无功！”</p ><p>　　“历史上第一次有国家想把熊猫提前送回去的，马来西亚就是不一样！”</p ><p>< img src='http://apps.lianziapp.com:8081/dfs/downloadpicture?sp=5&amp;id=1ad7d929ff64c3ab756ec82dfdc19258' alt=''></p ><p>　　事实上，“兴兴”和“靓靓”一直都被马民众视为中马交好的象征，它们每次网上直播都吸粉无数。</p ><p>　　而2015年在马来西亚出生的“暖暖”更成为当地民众的“大宝贝”，在它首次亮相时就吸引了大批游客到国家动物园参观。</p ><p>　　时任资源与环境部长称，它的名字“暖暖”是从近23000条网友取名建议中选出来的，象征了马来西亚和中国之间温暖和友好的关系。马来西亚国家动物园还在“暖暖”出生1周年时推出它的专属邮票。</p ><p>< img src='http://apps.lianziapp.com:8081/dfs/downloadpicture?sp=5&amp;id=e4d6ea5a36e259ca4c10617cde5daa29' alt=''></p ><p>　　2017年11月，当暖暖被送回中国时，马来西亚媒体用“悲伤的告别”作为大标题，报道了当地民众送别大熊猫“暖暖”的不舍之情，很多人在熊猫宝宝离开之前到动物园去跟它拍照说再见。</p ><p>< img src='http://apps.lianziapp.com:8081/dfs/downloadpicture?sp=5&amp;id=8091971c6f0299fd9da3d6ed3351bac3' alt='▲“暖暖”每次出现都会引起围观。'>▲“暖暖”每次出现都会引起围观。</p ><p>　　2018年1月，“兴兴”和“靓靓”的第二只幼崽出生。根据中马两国协议，大熊猫产下的幼崽必须在两年内归还给中方。泽维尔表示明年就会与中方就第二只幼崽的保育计划进行谈判，以决定何时将它送回中国。</p ><p>< img src='http://apps.lianziapp.com:8081/dfs/downloadpicture?sp=5&amp;id=bf96e4ada701af16582b4ff9375ca2b3' alt='▲“兴兴”和“靓靓”的第二只熊猫宝宝首次亮相。'>▲“兴兴”和“靓靓”的第二只熊猫宝宝首次亮相。</p ><p>　　这一次马方竟然想把“兴兴”和“靓靓”也提前送回国，令很多马来西亚网友难以接受，纷纷呼吁政府改变决定。在他们眼中，来自中国的大熊猫代表着两国“邦交之义”，这当然不是花多少钱所能衡量的。</p ><p>< img src='http://apps.lianziapp.com:8081/dfs/downloadpicture?sp=5&amp;id=9a91b832bb3dae6322136673fb3d96a1' alt=''></p ><p>　　正如一位马来西亚网友所说的：“不管怎样也不能提前送走两只大熊猫，我们还是非常重视与中国的友谊。";
              /*str+="fafafafafafa<img class='blessing-img' src='http://www.baidu.com' alt=/><div>hhhhimg</div>";
                str+="fafafafafafa<img class='blessing-img' src='http://www.baidu.com111' alt=/><div>hhhhimg</div>";*/
        List<String> imgStr = getImgStr(str);
        for (String item:imgStr){
            System.out.println(item);
        }


    }
}
