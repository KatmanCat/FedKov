package ru.Fedor.tgBot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.Fedor.tgBot.entity.Category;
import ru.Fedor.tgBot.entity.Client;
import ru.Fedor.tgBot.entity.Product;
import ru.Fedor.tgBot.repository.CategoryRepository;
import ru.Fedor.tgBot.repository.ClientRepository;
import ru.Fedor.tgBot.repository.ProductRepository;

import java.math.BigDecimal;

@SpringBootTest

public class FillingTests {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    // Добавление двух клиентов
    @Test
    void createTwoClients() {

        Client client1 = new Client();
        client1.setAddress("Ленинград");
        client1.setExternalId(1L);
        client1.setPhoneNumber("88005553535");
        client1.setFullName("Цой Виктор Робертович");
        clientRepository.save(client1);

        Client client2 = new Client();
        client2.setAddress("Севастополь");
        client2.setExternalId(2L);
        client2.setPhoneNumber("79782280928");
        client2.setFullName("Ковтунов Фёдор Олегович");
        clientRepository.save(client2);
    }

    // Создание основных категорий
    @Test
    void createCategoriesAndProducts() {
        Category pizza = new Category();
        pizza.setName("Пицца");
        pizza.setParent(null);
        categoryRepository.save(pizza);

        Category rolls = new Category();
        rolls.setName("Роллы");
        rolls.setParent(null);
        categoryRepository.save(rolls);

        Category burgers = new Category();
        burgers.setName("Бургеры");
        burgers.setParent(null);
        categoryRepository.save(burgers);

        Category drinks = new Category();
        drinks.setName("Напитки");
        drinks.setParent(null);
        categoryRepository.save(drinks);

        // Создание подкатегорий для категории "Роллы"

        Category classicRolls = new Category();
        classicRolls.setName("Классические роллы");
        classicRolls.setParent(rolls);
        categoryRepository.save(classicRolls);

        Category bakedRolls = new Category();
        bakedRolls.setName("Запеченные роллы");
        bakedRolls.setParent(rolls);
        categoryRepository.save(bakedRolls);

        Category sweetRolls = new Category();
        sweetRolls.setName("Сладкие роллы");
        sweetRolls.setParent(rolls);
        categoryRepository.save(sweetRolls);

        Category setRolls = new Category();
        setRolls.setName("Наборы");
        setRolls.setParent(rolls);
        categoryRepository.save(setRolls);

        // Создание подкатегорий для категории "Бургеры"

        Category classicBurgers = new Category();
        classicBurgers.setName("Классические бургеры");
        classicBurgers.setParent(burgers);
        categoryRepository.save(classicBurgers);

        Category spicyBurgers = new Category();
        spicyBurgers.setName("Острые бургеры");
        spicyBurgers.setParent(burgers);
        categoryRepository.save(spicyBurgers);

        // Создание подкатегорий для категории "Напитки"

        Category carbonatedDrinks = new Category();
        carbonatedDrinks.setName("Газированные напитки");
        carbonatedDrinks.setParent(drinks);
        categoryRepository.save(carbonatedDrinks);

        Category energeticDrinks = new Category();
        energeticDrinks.setName("Энергетические напитки");
        energeticDrinks.setParent(drinks);
        categoryRepository.save(energeticDrinks);


        Category juiceDrinks = new Category();
        juiceDrinks.setName("Соки");
        juiceDrinks.setParent(drinks);
        categoryRepository.save(juiceDrinks);

        Category otherDrinks = new Category();
        otherDrinks.setName("Другие напитки");
        otherDrinks.setParent(drinks);
        categoryRepository.save(otherDrinks);

        // Создание товаров для категорий

        // Товары для категории "Пицца"
        Product pizza1 = new Product();
        pizza1.setName("Неаполитана");
        pizza1.setDescription("Томатный соус, молодая моцарелла, моцарелла, бекон, томаты черри, соус песто и руккола");
        pizza1.setPrice(BigDecimal.valueOf(449));
        pizza1.setCategory(pizza);
        productRepository.save(pizza1);

        Product pizza2 = new Product();
        pizza2.setName("Четыре сезона");
        pizza2.setDescription("Ветчина, пикантная пепперони, нежная моцарелла, кубики брынзы, шампиньоны, томаты, фирменный томатный соус, итальянские травы");
        pizza2.setPrice(BigDecimal.valueOf(429));
        pizza2.setCategory(pizza);
        productRepository.save(pizza2);

        Product pizza3 = new Product();
        pizza3.setName("Лолосось");
        pizza3.setDescription("Филе лосося, нежная моцарелла, сыр творожный, томаты, авторский соус песто, фирменный сливочный соус");
        pizza3.setPrice(BigDecimal.valueOf(519));
        pizza3.setCategory(pizza);
        productRepository.save(pizza3);

        // Товары для категории "Роллы"

        // Товары для категории "Классические Роллы"
        Product rollClassic1 = new Product();
        rollClassic1.setName("Филадельфия");
        rollClassic1.setDescription("лосось, огурец, сыр сливочный 217 г");
        rollClassic1.setPrice(BigDecimal.valueOf(600));
        rollClassic1.setCategory(classicRolls);
        productRepository.save(rollClassic1);

        Product rollClassic2 = new Product();
        rollClassic2.setName("Калифорния");
        rollClassic2.setDescription("краб-крем, авокадо, огурец, икра масаго 212 г");
        rollClassic2.setPrice(BigDecimal.valueOf(500));
        rollClassic2.setCategory(classicRolls);
        productRepository.save(rollClassic2);

        Product rollClassic3 = new Product();
        rollClassic3.setName("Ролл с тунцом");
        rollClassic3.setDescription("тунец 102 г");
        rollClassic3.setPrice(BigDecimal.valueOf(350));
        rollClassic3.setCategory(classicRolls);
        productRepository.save(rollClassic3);

        // Товары для категории "Запеченные роллы"

        Product rollBaked1 = new Product();
        rollBaked1.setName("Ролл Румяный");
        rollBaked1.setDescription("креветки, сыр сливочный, яки соус, кунжут, унаги соус, масаго 159 г");
        rollBaked1.setPrice(BigDecimal.valueOf(380));
        rollBaked1.setCategory(bakedRolls);
        productRepository.save(rollBaked1);

        Product rollBaked2 = new Product();
        rollBaked2.setName("Запечённый ролл с угрём и тигровой креветкой");
        rollBaked2.setDescription("креветка тигровая, угорь, сыр сливочный, авокадо, икра масаго, майонезный соус, унаги соус, кунжут 304 г");
        rollBaked2.setPrice(BigDecimal.valueOf(650));
        rollBaked2.setCategory(bakedRolls);
        productRepository.save(rollBaked2);

        Product rollBaked3 = new Product();
        rollBaked3.setName("Медовая креветка");
        rollBaked3.setDescription("креветка тигровая, сыр сливочный, огурец, масаго, сырный соус, медовый соус с горчицей, кунжут 261 г");
        rollBaked3.setPrice(BigDecimal.valueOf(419));
        rollBaked3.setCategory(bakedRolls);
        productRepository.save(rollBaked3);

        // Товары для категории "Сладкие роллы"

        Product rollSweet1 = new Product();
        rollSweet1.setName("Фруктовый ролл");
        rollSweet1.setDescription("Этот сладкий ролл обычно сделан с использованием фруктов, таких как манго, клубника, банан или киви");
        rollSweet1.setPrice(BigDecimal.valueOf(590));
        rollSweet1.setCategory(sweetRolls);
        productRepository.save(rollSweet1);

        Product rollSweet2 = new Product();
        rollSweet2.setName("Шоколадный ролл");
        rollSweet2.setDescription("Этот ролл представляет собой комбинацию сладкого риса, клубничного джема, бананов или ягод, завернутых в слой нори и обсыпанных шоколадной крошкой");
        rollSweet2.setPrice(BigDecimal.valueOf(670));
        rollSweet2.setCategory(sweetRolls);
        productRepository.save(rollSweet2);

        Product rollSweet3 = new Product();
        rollSweet3.setName("Карамельный ролл");
        rollSweet3.setDescription("В этом сладком ролле используется карамель или карамельный соус в сочетании с бананами, орехами или клубникой");
        rollSweet3.setPrice(BigDecimal.valueOf(800));
        rollSweet3.setCategory(sweetRolls);
        productRepository.save(rollSweet3);

        // Товары для категории "Наборы"

        Product setRolls1 = new Product();
        setRolls1.setName("ЛавИз");
        setRolls1.setDescription("Состав: красный дракон лайт, три сыра, филадельфия креветка, запечённый спайс, запечённый с мидией, запечённый с лососем.");
        setRolls1.setPrice(BigDecimal.valueOf(1600));
        setRolls1.setCategory(setRolls);
        productRepository.save(setRolls1);

        Product setRolls2 = new Product();
        setRolls2.setName("Бум-Бум");
        setRolls2.setDescription("Состав: филадельфия лосось лайт, филадельфия креветка лайт, запечённый с крабом, запечённый с мидией, запечённый с беконом.");
        setRolls2.setPrice(BigDecimal.valueOf(1700));
        setRolls2.setCategory(setRolls);
        productRepository.save(setRolls2);

        Product setRolls3 = new Product();
        setRolls3.setName("ТопЧик");
        setRolls3.setDescription("Состав: Филадельфия креветка/лосось лайт, Филадельфия с копченным лососем в огурце, Запеченный сырный/спайс краб.");
        setRolls3.setPrice(BigDecimal.valueOf(1200));
        setRolls3.setCategory(setRolls);
        productRepository.save(setRolls3);

        // Товары для категории "Бургеры"

        // Товары для категории "Классические Бургеры"

        Product burgersClassic1 = new Product();
        burgersClassic1.setName("Гамбургер");
        burgersClassic1.setDescription("Классический бургер, состоящий из прожаренной котлеты из мяса, обжаренного лука, листьев салата, кетчупа и майонеза в мягкой булочке");
        burgersClassic1.setPrice(BigDecimal.valueOf(65));
        burgersClassic1.setCategory(classicBurgers);
        productRepository.save(burgersClassic1);

        Product burgersClassic2 = new Product();
        burgersClassic2.setName("Чизбургер");
        burgersClassic2.setDescription("Вариация гамбургера, в которой добавляется ломтик сыра на котлету перед подачей");
        burgersClassic2.setPrice(BigDecimal.valueOf(78));
        burgersClassic2.setCategory(classicBurgers);
        productRepository.save(burgersClassic2);

        Product burgersClassic3 = new Product();
        burgersClassic3.setName("Чикенбургер");
        burgersClassic3.setDescription("Обжаренная куриная котлета из сочного куриного мяса, панированная в сухарях, которая подается на карамелизованной булочке, заправленной свежим салатом и специальным соусом");
        burgersClassic3.setPrice(BigDecimal.valueOf(64));
        burgersClassic3.setCategory(classicBurgers);
        productRepository.save(burgersClassic3);

        // Товары для категории "Острые Бургеры"

        Product burgersSpicy1 = new Product();
        burgersSpicy1.setName("Драконий Бургер");
        burgersSpicy1.setDescription("Этот бургер заполнен силой острых специй и соусов, включая соус срирача, карибский перец скотч боннет, ломтик кимчи и свежая зелень.");
        burgersSpicy1.setPrice(BigDecimal.valueOf(590));
        burgersSpicy1.setCategory(spicyBurgers);
        productRepository.save(burgersSpicy1);

        Product burgersSpicy2 = new Product();
        burgersSpicy2.setName("Чили Бургер");
        burgersSpicy2.setDescription("Этот бургер заправлен крепкими порциями острого чили-кетчупа, пикантным сыром чеддер, горячими пепперони и свежими ломтиками помидора. ");
        burgersSpicy2.setPrice(BigDecimal.valueOf(560));
        burgersSpicy2.setCategory(spicyBurgers);
        productRepository.save(burgersSpicy2);

        Product burgersSpicy3 = new Product();
        burgersSpicy3.setName("Пламенный Бургер");
        burgersSpicy3.setDescription("Состоит из острых чили-котлет, маринованных халапеньо перцев, кисло-сладкого соуса на основе табаско и пикантного горчично-майонезного соуса.");
        burgersSpicy3.setPrice(BigDecimal.valueOf(700));
        burgersSpicy3.setCategory(spicyBurgers);
        productRepository.save(burgersSpicy3);

        // Товары для категории "Напитки"

        // Товары для категория "Газированные напитки"

        Product drinksCarbonated1 = new Product();
        drinksCarbonated1.setName("Байкал");
        drinksCarbonated1.setDescription("Пейте без остановки напитки из Черноголовки");
        drinksCarbonated1.setPrice(BigDecimal.valueOf(100));
        drinksCarbonated1.setCategory(carbonatedDrinks);
        productRepository.save(drinksCarbonated1);

        Product drinksCarbonated2 = new Product();
        drinksCarbonated2.setName("Добрый Апельсин");
        drinksCarbonated2.setDescription("Достойное импортозамещение");
        drinksCarbonated2.setPrice(BigDecimal.valueOf(130));
        drinksCarbonated2.setCategory(carbonatedDrinks);
        productRepository.save(drinksCarbonated2);

        Product drinksCarbonated3 = new Product();
        drinksCarbonated3.setName("Рич Биттер");
        drinksCarbonated3.setDescription("Горький лимонный привкус позволяет вам видеть сквозь стены");
        drinksCarbonated3.setPrice(BigDecimal.valueOf(150));
        drinksCarbonated3.setCategory(carbonatedDrinks);
        productRepository.save(drinksCarbonated3);

        // Товары для категория "Энергетические напитки"

        Product drinksEnergetic1 = new Product();
        drinksEnergetic1.setName("Flash");
        drinksEnergetic1.setDescription("Специальное издание для школьников");
        drinksEnergetic1.setPrice(BigDecimal.valueOf(90));
        drinksEnergetic1.setCategory(energeticDrinks);
        productRepository.save(drinksEnergetic1);

        Product drinksEnergetic2 = new Product();
        drinksEnergetic2.setName("Burn");
        drinksEnergetic2.setDescription("Сжигает твое здоровье");
        drinksEnergetic2.setPrice(BigDecimal.valueOf(130));
        drinksEnergetic2.setCategory(energeticDrinks);
        productRepository.save(drinksEnergetic2);

        Product drinksEnergetic3 = new Product();
        drinksEnergetic3.setName("RedBull");
        drinksEnergetic3.setDescription("Все равно не поможет написать тебе курсач за ночь");
        drinksEnergetic3.setPrice(BigDecimal.valueOf(150));
        drinksEnergetic3.setCategory(energeticDrinks);
        productRepository.save(drinksEnergetic3);

        // Товары для категория "Соки"

        Product drinksJuice1 = new Product();
        drinksJuice1.setName("Любимый");
        drinksJuice1.setDescription("Сок Любимый обычно ассоциируется с натуральными вкусами фруктов и ягод.");
        drinksJuice1.setPrice(BigDecimal.valueOf(100));
        drinksJuice1.setCategory(juiceDrinks);
        productRepository.save(drinksJuice1);

        Product drinksJuice2 = new Product();
        drinksJuice2.setName("Добрый");
        drinksJuice2.setDescription("Сок Добрый известен своим свежим и приятным вкусом");
        drinksJuice2.setPrice(BigDecimal.valueOf(150));
        drinksJuice2.setCategory(juiceDrinks);
        productRepository.save(drinksJuice2);

        Product drinksJuice3 = new Product();
        drinksJuice3.setName("Рич");
        drinksJuice3.setDescription("Сок Рич обычно характеризуется высоким содержанием питательных веществ, таких как витамины С и Е, бета-каротин и другие.");
        drinksJuice3.setPrice(BigDecimal.valueOf(200));
        drinksJuice3.setCategory(juiceDrinks);
        productRepository.save(drinksJuice3);

        // Товары для категория "Другие"

        Product drinksOther1 = new Product();
        drinksOther1.setName("Вода");
        drinksOther1.setDescription("Боржоми лечит ваши почки");
        drinksOther1.setPrice(BigDecimal.valueOf(100));
        drinksOther1.setCategory(otherDrinks);
        productRepository.save(drinksOther1);

        Product drinksOther2 = new Product();
        drinksOther2.setName("Чай");
        drinksOther2.setDescription("Чай липтон");
        drinksOther2.setPrice(BigDecimal.valueOf(90));
        drinksOther2.setCategory(otherDrinks);
        productRepository.save(drinksOther2);

        Product drinksOther3 = new Product();
        drinksOther3.setName("Кофе");
        drinksOther3.setDescription("Латте");
        drinksOther3.setPrice(BigDecimal.valueOf(150));
        drinksOther3.setCategory(otherDrinks);
        productRepository.save(drinksOther3);

    }
}