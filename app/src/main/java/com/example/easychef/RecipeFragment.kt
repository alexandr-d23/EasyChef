package com.example.easychef

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import com.example.easychef.data.Recipe
import com.google.android.material.floatingactionbutton.FloatingActionButton


class RecipeFragment : Fragment() {
    private var fabBtn: FloatingActionButton? = null
    private var recipeButton2: ImageButton? = null
    private var recipeButton3: ImageButton? = null
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        fabBtn = view.findViewById(R.id.floatingActionButton)
        fabBtn?.setOnClickListener {
            findNavController().navigate(R.id.action_recipeFragment_to_addRecipeFragment)
        }

        recipeButton2 = view.findViewById(R.id.button2)
        recipeButton2?.setOnClickListener {
            findNavController().navigate(R.id.action_recipeFragment_to_recipePageFragment)
        }
        recipeButton3 = view.findViewById(R.id.button3)
        recipeButton3?.setOnClickListener {
            findNavController().navigate(R.id.action_recipeFragment_to_recipePageFragment)
        }
        super.onViewCreated(view, savedInstanceState)
        val recipes = listOf(
            Recipe(
                1,
                "Банановое печенье с кокосовой стружкой",
                "https://all-cook.com/uploads/recepty/recept-499-main.jpg",
                " 3 банана, 1/2 стакана кокосовой стружки, 2 стакана овсяных хлопьев, 1/4 стакана растительного масла, 10 г ванильного сахара",
                "1. Разогреть духовку до температуры 180 градусов. 2. Приготовить банановое пюре в блендере или размять бананы вилкой. 3. В большой миске смешать банановое пюре, овсяные хлопья, кокосовую стружку, растительное масло и ванильный сахар. 4. На противень постелить бумагу для выпекания. Столовой ложкой выложить печенье на противень и отправить в духовку на 15–20 минут."
            ),
            Recipe(2, "Вок с курицей","https://magadanpravda.ru/images/2020/aprel_2020/19.04.2020/Edatomy.ru.jpg",
                "теклянная лапша - 150 гр.\n" +
                        "куриное филе - 500 гр.\n" +
                        "красный болгарский перец - 2 шт.\n" +
                        "красный лук - 1 шт.\n" +
                        "морковь крупная - 1 шт.\n" +
                        "чеснок - 2 зубчика\n" +
                        "стручковая фасоль - 50 гр.\n" +
                        "соль - по вкусу\n" +
                        "соевый соус - 80 мл.\n" +
                        "кунжут - 2 ст.л.\n" +
                        "растительное масло для обжарки\n", "Куриное филе нарезаем тонкими полосками.\n" +
                        "Выкладываем в контейнер и заливаем 40 мл. соевого соуса. Убираем в холодильник на 30 минут. Если есть возможность, можно мариновать дольше.\n" +
                        "В сковороде WOK или просто глубокой сковороде разогреваем растительное масло. И обжариваем курицу.\n" +
                        "Затем добавляем нарезанный полукольцами лук. И жарим 5 минут.\n" +
                        "Добавляем нашинкованную морковь. Морковь можно натереть на терке.\n" +
                        "Добавляем болгарский перец нарезанный тонкими полосками. И обжариваем 2 минуты.\n" +
                        "Затем добавляем измельченный чеснок и жарим все до полной готовности всех ингредиентов.\n" +
                        "Выкладываем в сковороду стручковую фасоль, обжариваем еще 2 минуты.\n" +
                        "И перекладываем все в глубокую тарелку.\n" +
                        "Бобовую лапшу заливаем кипящей водой и оставляем на 3 минуты.\n" +
                        "Затем промываем лапшу холодной водой и оставляем в дуршлаге немного подсушить.\n" +
                        "Готовую лапшу обжариваем на растительном масле пока она не станет эластичной около 5 минут.\n" +
                        "Затем добавляем 40 мл. соевого соуса и обжариваем еще около 3 минут.\n" +
                        "Соединяем готовые овощи и куриное мясо с обжаренной лапшой. Все тщательно перемешиваем и обжариваем еще 3-4 минуты.\n" +
                        "Готовое блюдо посыпаем кунжутом и подаем к столу горячим.\n"),
            Recipe(3, "Классическая шарлотка", "https://img.povar.ru/main/7c/b9/d3/f5/sharlotka_s_yablokami_klassicheskaya_v_duhovke-394351.jpg","Сахара  1 стакан\n" +
                    "Яйцо куриное 5 штук\n" +
                    "Пшеничная мука 1 стакан\n" +
                    "Яблоко 7 штук\n" +
                    "Растительное масло 1 столовая ложка\n" +
                    "Сода ½ чайной ложки\n", "Разогреть духовку. Отделить белки от желтков. Белки взбить в крепкую пену, постепенно добавляя сахар.\n" +
                    "Продолжать взбивать, добавляя по одному желтки, затем гашеную соду и муку. Тесто по консистенции должно напоминать сметану.\n" +
                    "Смазать противень растительным маслом. Вылить половину теста на противень, разложить равномерно порезанные дольками яблоки, залить второй половиной теста.\n" +
                    "Поместить противень в разогретую духовку. 3 минуты подержать при температуре 200 градусов, затем убавить до 180 и выпекать 20-25 минут.\n"),
            Recipe(4, "Оякодон","https://www.gastronom.ru/binfiles/images/20160428/b2204fbc.jpg",
                "Репчатый лук 1 головка\n" +
                        "Куриное филе 300г\n" +
                        "Рис ½ стакана\n" +
                        "Яйцо куриное 3 штуки\n" +
                        "Соевый соус 6 столовых ложек\n" +
                        "Сахар 2 столовые ложки\n" +
                        "Зеленый лук 20г\n","Репчатый лук очистить и нарезать тонкими полукольцами. На среднем огне разогреть сковороду и влить в нее шесть столовых ложек соевого соуса.\n" +
                        "Как только соевый соус начнет кипеть, бросить в сковороду луковые полукольца и посыпать сверху сахаром. Готовить, периодически помешивая, две-три минуты.\n" +
                        "Тем временем куриное филе нарезать небольшими кусочками — сильно измельчать мясо не нужно, готовые ломтики должны остаться сочными и плотными.\n" +
                        "Положить курицу в сковороду и перемешать с соусом. Когда мясо побелеет с одной стороны, перевернуть аккуратно ломтики и потушить еще пару минут. Куриное филе готовится удивительно быстро: максимум три-четыре минуты.\nВ отдельной миске вилкой или венчиком быстро взбить яйца в однородную смесь. Добавлять соль при этом не нужно — соевый соус, в котором тушится мясо, и так достаточно солон.\n" +
                        "Вылить яичную смесь на сковороду, стараясь равномерно покрыть все мясо. Накрыть сковороду крышкой и готовить омлет три-четыре минуты, не мешая, пока яйца как следует не схватятся.\n" +
                        "Зеленый лук измельчить. На сервировочную тарелку выложить горкой теплый рис, сваренный на пару.\n" +
                        "Сверху на рис аккуратно выложить омлет — для удобства его можно разделить лопаткой на треугольные сегменты. Посыпать оякодон измельченным зеленым луком — и подавать горячим.\n"),
            Recipe(5,"Куриный суп", "https://menunedeli.ru/wp-content/uploads/2020/04/Kuriniy-sup-za-15-minut-500x350-1000x700.jpg","Куриные окорочка 3 штуки\n" +
                    "Картофель 3 штуки\n" +
                    "Морковь 1 штука\n" +
                    "Репчатый лук 1 штука\n" +
                    "Вермишель 30 г\n" +
                    "Зелень 50 г\n" +
                    "Соль по вкусу\n" +
                    "Молотый белый перец по вкусу\n" +
                    "Молотый черный перец по вкусу\n" +
                    "Сушеный эстрагон щепотка\n","Промытые окорочка кладем в кастрюлю, заливаем холодной водой, ставим на сильный огонь. Когда вода закипит, убавляем огонь до минимума, солим по вкусу, кладем не очищенную вымытую луковицу и закрываем крышкой. Через 30 минут вылавливаем луковицу, кладем морковку, нарезанную кубиками. Через 5 минут добавляем очищенный и нарезанный картофель, пробуем на соль. Варим еще 10–15 минут.\n" +
                    "Затем добавляем вермишель, варим 15 минут. После кладем специи (щепотку эстрагона, душистого и белого перцев, немного черного). Через 5 минут выключаем. Даем супу настояться 10 минут. В тарелку с супом можно положить половинку вареного яйца и мелко нарезанную зелень.\n"),
            Recipe(6,"Пирог со смородиной","https://rutxt.ru/files/14664/original/55245d6dd3.JPG","1 яйцо\n" +
                    "100 мл ряженки\n" +
                    "40 гр пшеничной муки\n" +
                    "2 гр разрыхлителя \n" +
                    "сахар по вкусу\n" +
                    "120 гр смородины\n","Разогреть духовку до 180 градусов.\n" +
                    "  Взбить белок до пиков, отдельно от желтка. Смешать все ингредиенты и аккуратно вмешать в массу с белком.\n" +
                    "Перелить тесто в форму. Сверху посыпать ягодами.\n" +
                    "Выпекать 30 минут.\n"),
            Recipe(7,"Банановый рулет", "https://www.patee.ru/r/x6/10/87/b0/960m.jpg","100 мл растительного молока\n" +
                    "40 гр пшеничной муки\n" +
                    "1 яйцо\n" +
                    "сахар по вкусу\n" +
                    "1 банан\n" +
                    "100 гр мягкого творога\n", "Смешать муку, яйцо и сахар и выпекать на сковороде до готовности блинчиков.\n" +
                    "Каждый блинчик смазать творогом и завернуть внутрь банан.\n"),
            Recipe(8,
                "Сочники с творогом",
                "https://kulinarnia.ru/wp-content/uploads/2016/07/sochniki-s-tvorogom-recept-s-foto.jpg","30 гр пшеничной муки\n" +
                        "30 гр рисовой муки\n" +
                        "200 гр творога\n" +
                        "1 яйцо\n" +
                        "2 гр разрыхлителя\n" +
                        "масло растительное\n" +
                        "сахар\n" +
                        "5 гр кокосовой стружки\n",
                "Смешать все сухие ингредиенты, 90 гр творога и яичный желток до однородного состояния.\n" +
                        " Разделить тесто на несколько частей, раскатать и сделать небольшие кружочки.\n" +
                        "Смешать в отдельной ёмкости оставшиеся ингредиенты и выложить в середину кружочков, затем сложить пополам.\n" +
                        "Выпекать в духовке при 180 градусах 30 минут.\n"),
            Recipe(9,"Форель в сливочном соусе",
                "https://poklevka.com/uploads/posts/2019-08/1566818642_forel-v-slivochno-chesnochnom-souse.jpg",
                "стейк форели\n" +
                        "200 гр сливок\n" +
                        "20 гр сливочного масла\n" +
                        "10 шт помидоров черри\n" +
                        "зелень\n" +
                        "2 зубчика чеснока\n" +
                        "соль, перец\n",
                "Пожарить форель на разогретой сковороде с каждой стороны по 3 минуты.\n" +
                        "Кладём на эту же сковороду сливочное масло, жарим чеснок, черри и зелень.\n" +
                        "Добавляем сливки и доводим до кипения.\n" +
                        "Солим и перчим.\n" +
                        "Кладем рыбу на сковороду и тушим 10-15 минут на среднем огне.\n"),
            Recipe(10,"Чизкейк с шоколадом и фундуком",
                "https://img-global.cpcdn.com/recipes/942a6c2379376f80/680x482cq70/tort-snikiers-s-varienoi-sghushchienkoi-biez-vypiechki-%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D0%BE%D0%B5-%D1%84%D0%BE%D1%82%D0%BE-%D1%80%D0%B5%D1%86%D0%B5%D0%BF%D1%82%D0%B0.jpg",
                "2 яйца\n" +
                        "70 мл молока\n" +
                        "15 гр сливочного масла\n" +
                        "70 гр рисовой муки\n" +
                        "сахар по вкусу\n" +
                        "140 гр мягкого творога\n" +
                        "100 гр творожного сыра\n" +
                        "30 гр кукурузного крахмала\n" +
                        "3 гр какао\n" +
                        "30 гр фундука\n",
                "Для основы смешать 2 желтка, 20 мл молока, 15 гр сливочного масла, 70 гр муки и сахар.\n" +
                        "Вымешиваем до однородного состояния и убираем в холодильник на 20 минут.\n" +
                        "Распределить тесто по форме и выпекать в разогретой до 180 градусов духовке 15 минут.\n" +
                        "Для начинки смешать 2 белка, 240 гр творога, творожный сыр, крахмал и сахар.\n" +
                        "Залить начинку в основу и выпекать ещё 30 минут.\n" +
                        "Остудить чизкейк в холодильнике.\n" +
                        "Смешать молоко, какао, сахар и фундук и выливаем на чизкейк.\n"),
            Recipe(11,"Грибной крем-суп\n",
                "https://img.povar.ru/main/e4/9d/33/f3/gribnoi_krem-sup_s_domashnimi_grenkami-387918.jpg",
                "400 гр шампиньонов\n" +
                        "120 мл сливок\n" +
                        "300 гр цветной капусты\n" +
                        "лук репчатый\n" +
                        "1 зубчик чеснока\n" +
                        "соль, перец\n",
                "Нарезаем лук, шампиньоны и чеснок.\n" +
                        "Добавляем на разогретую сковороду и жарим до золотистого цвета.\n" +
                        "Варим цветную капусту.\n" +
                        "Смешиваем капусту, обжаренный лук, шампиньоны, чеснок, соль и перец в кастрюлю.\n" +
                        "Перемалываем блендером.\n" +
                        "Добавляем сливки и хорошо перемешиваем.\n"),
            Recipe(12,"Овощное рагу из кабачков с картофелем\n",
                "https://www.gastronom.ru/binfiles/images/20170207/b6c15175.jpg",
                "Кабачки 1 шт\n" +
                        "Репчатый лук 1 шт\n" +
                        "Помидоры 3 шт\n" +
                        "Морковь 1 шт\n" +
                        "Зеленый перец 1 шт\n" +
                        "Картофель 4 шт\n" +
                        "Чеснок 2 зубчика\n" +
                        "Соль 10 гp\n" +
                        "Молотый черный перец 5 г\n" +
                        "Растительное масло 50 мл\n",
                "Измельченный репчатый лук и тертую на крупной терке морковь обжарить в глубокой сковороде на растительном масле.\n" +
                        "Картофель очистить, порезать крупными кусками и обжарить вместе с луком и морковью.\n" +
                        "Из перца удалить семена, нарезать полосками и добавить к овощам.\n" +
                        " Кабачки очистить, удалить семена, порезать кубиками и добавить в сковороду с остальными овощами.\n" +
                        "Обжарить все вместе в течение 10–15 минут, время от времени помешивая.\n" +
                        "Помидоры порезать дольками и добавить в рагу. Добавить соль, перец, пропущенный через пресс чеснок.\n" +
                        "Все перемешать, уменьшить огонь, накрыть сковороду крышкой и тушить 15–20 минут, время от времени помешивая.\n" +
                        "Когда все овощи будут готовы, выключить огонь и дать рагу настояться под крышкой.\n"),
            Recipe(13,"Креветки в сливочно-чесночном соусе\n",
                "https://lenta.gcdn.co/globalassets/recepty/k/----3/----.jpg?preset=medium",
                "Сливочное масло 50 г\n" +
                        "Чеснок 2 зубчика\n" +
                        "Креветки 800 г\n" +
                        "Рубленая петрушка 3 столовые ложки\n" +
                        "Соль по вкусу\n" +
                        "Сливки 200 мл\n",
                " В глубокой сковороде растопить масло, добавить чеснок и немного потушить.\n" +
                        "Влить сливки, все перемешать и довести до кипения. Соус готов.\n" +
                        "Далее добавить в сковороду очищенные креветки и тушить 8–9 минут. В самом конце добавить петрушку и перемешать.\n" +
                        "Вынуть креветки. Соус оставить на огне, пока он слегка не загустеет.\n" +
                        "Бросить креветки обратно в соус и подержать на огне 2 минуты — блюдо готово.\n"),
            Recipe(13,"Теплый картофельный салат с маслинами и перцем",
                "https://image.freepik.com/free-photo/warm-potato-salad-with-olives-pepper-parsley-and-red-onion-on-black-ceramic-plate-on-dark-concrete-background_253362-4343.jpg",
                "Чеснок 3 зубчика\n" +
                        "Хересный уксус 3 столовые ложки\n" +
                        "Соль 1 чайная ложка\n" +
                        "Перец чили хлопьями ¼ чайной ложки\n" +
                        "Оливковое масло 5 столовых ложек\n" +
                        "Молодой картофель 1,399 кг\n" +
                        "Консервированный перец 110 г\n" +
                        "Рубленая петрушка 0,6 стакана\n" +
                        "Маслины без косточек 0,3 стакана\n",
                " Хорошо промойте картофель и сварите в кипящей подсоленной воде до мягкости, примерно 10-15 минут. Слейте и порежьте пополам.\n" +
                        "В ступке разотрите чеснок со щепоткой соли до состояния пасты. Переложите в большую миску и смешайте с уксусом, солью и хлопьями чили. Взбивая, введите оливковое масло.\n" +
                        "Добавьте горячий картофель и хорошо перемешайте. Оставьте примерно на 30 минут, пока картофель не станет теплым. Затем добавьте мелко нарезанные перцы, петрушку и нарезанные маслины. Подавайте теплым.\n"),
            Recipe(14, "Лимонад", "https://www.kamis-pripravy.ru/upload/medialibrary/bba/bba792ac9e39c6ae5999886c177cd5fe.jpg",
                "Сахар 200 г\n" +
                        "Лимон 5 штук\n" +
                        "Вода 250 мл\n" +
                        "Газированная вода 750 мл\n" +
                        "Лед по вкусу\n",
                "В небольшой сотейник всыпать сахар, влить стакан воды, довести до кипения и снять с огня.\n" +
                        "Выдавить сок из пяти лимонов — должно получиться около стакана сока.\n" +
                        "В кувшин влить лимонный сок и сахарный сироп. Добавить газированную воду и кубики льда, чтобы сильнее охладить лимонад. Если лимонад слишком сладкий, добавить еще воды.\n")
        )

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipe, container, false)
    }
}
