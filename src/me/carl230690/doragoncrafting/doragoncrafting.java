package me.carl230690.doragoncrafting;

import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class doragoncrafting extends JavaPlugin
  implements Listener
{
  public final Logger logger = Logger.getLogger("Minecraft");
  public static doragoncrafting plugin;

  public void onDisable()
  {
    PluginDescriptionFile pdfFile = getDescription();
    this.logger.info(pdfFile.getName() + " Has Been Disabled!");
  }

  public void onEnable()
  {
    PluginDescriptionFile pdfFile = getDescription();
    this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has Been Enabled!");

    PluginManager pm = getServer().getPluginManager();
    pm.registerEvents(this, this);

    ShapedRecipe nametag = new ShapedRecipe(new ItemStack(
      Material.NAME_TAG, 1)).shape(new String[] { 
      "  %", " * ", "*  " })
      .setIngredient('*', Material.IRON_INGOT)
      .setIngredient('%', Material.STRING);

    getServer().addRecipe(nametag);

    ShapedRecipe ironbarding = new ShapedRecipe(new ItemStack(
      Material.IRON_BARDING, 1)).shape(new String[] { 
      "*&*", "&^&", "^*^" })
      .setIngredient('*', Material.STRING)
      .setIngredient('&', Material.IRON_INGOT)
      .setIngredient('^', Material.LEATHER);

    getServer().addRecipe(ironbarding);

    ShapedRecipe goldbarding = new ShapedRecipe(new ItemStack(
      Material.GOLD_BARDING, 1)).shape(new String[] { 
      "%*%", "*$*", "$%$" })
      .setIngredient('*', Material.GOLD_INGOT)
      .setIngredient('%', Material.STRING)
      .setIngredient('$', Material.LEATHER);

    getServer().addRecipe(goldbarding);

    ShapedRecipe diamondbarding = new ShapedRecipe(new ItemStack(
      Material.DIAMOND_BARDING, 1)).shape(new String[] { 
      "%*%", "*$*", "$%$" })
      .setIngredient('*', Material.DIAMOND)
      .setIngredient('%', Material.STRING)
      .setIngredient('$', Material.LEATHER);

    getServer().addRecipe(diamondbarding);

    ShapedRecipe saddle = new ShapedRecipe(new ItemStack(
      Material.SADDLE, 1)).shape(new String[] { 
      "- -", "(-(", ")))" })
      .setIngredient('(', Material.IRON_INGOT)
      .setIngredient(')', Material.STRING)
      .setIngredient('-', Material.LEATHER);

    getServer().addRecipe(saddle);

    ShapedRecipe xpbottle = new ShapedRecipe(new ItemStack(
      Material.EXP_BOTTLE, 1)).shape(new String[] { 
      "yey", "ygy", "ggg" })
      .setIngredient('e', Material.EMERALD)
      .setIngredient('y', Material.GOLD_INGOT)
      .setIngredient('g', Material.GLASS_BOTTLE);

    getServer().addRecipe(xpbottle);
    
    ItemStack newItem1 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem1.setDurability((short)54);

    ShapedRecipe zombie = new ShapedRecipe(newItem1);

    zombie.shape(new String[] { "SSS", "SES", "SSS" });
    zombie.setIngredient('E', Material.EGG);
    zombie.setIngredient('S', Material.ROTTEN_FLESH);

    ItemStack newItem2 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem2.setDurability((short)50);

    ShapedRecipe creeper = new ShapedRecipe(newItem2);

    creeper.shape(new String[] { "STS", "SES", "SSS" });
    creeper.setIngredient('E', Material.EGG);
    creeper.setIngredient('S', Material.SULPHUR);
    creeper.setIngredient('T', Material.TNT);

    ItemStack newItem3 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem3.setDurability((short)51);

    ShapedRecipe skeleton = new ShapedRecipe(newItem3);

    skeleton.shape(new String[] { "SSS", "SES", "SSS" });
    skeleton.setIngredient('E', Material.EGG);
    skeleton.setIngredient('S', Material.BONE);

    ItemStack newItem4 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem4.setDurability((short)52);

    ShapedRecipe spider = new ShapedRecipe(newItem4);

    spider.shape(new String[] { "SAS", "SES", "SSS" });
    spider.setIngredient('A', Material.SPIDER_EYE);
    spider.setIngredient('E', Material.EGG);
    spider.setIngredient('S', Material.STRING);

    ItemStack newItem6 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem6.setDurability((short)58);

    ShapedRecipe enderman = new ShapedRecipe(newItem6);

    enderman.shape(new String[] { "PPP", "PEP", "PPP" });
    enderman.setIngredient('E', Material.EGG);
    enderman.setIngredient('P', Material.ENDER_PEARL);

    ItemStack newItem7 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem7.setDurability((short)55);

    ShapedRecipe slime = new ShapedRecipe(newItem7);

    slime.shape(new String[] { "SSS", "SES", "SSS" });
    slime.setIngredient('E', Material.EGG);
    slime.setIngredient('S', Material.SLIME_BALL);

    ItemStack newItem8 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem8.setDurability((short)56);

    ShapedRecipe ghast = new ShapedRecipe(newItem8);

    ghast.shape(new String[] { "SGS", "DED", "SSS" });
    ghast.setIngredient('E', Material.EGG);
    ghast.setIngredient('S', Material.NETHERRACK);
    ghast.setIngredient('G', Material.GLOWSTONE_DUST);
    ghast.setIngredient('D', Material.SULPHUR);

    ItemStack newItem9 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem9.setDurability((short)57);

    ShapedRecipe udpig = new ShapedRecipe(newItem9);

    udpig.shape(new String[] { "RRR", "PEG", "NNN" });
    udpig.setIngredient('E', Material.EGG);
    udpig.setIngredient('R', Material.ROTTEN_FLESH);
    udpig.setIngredient('G', Material.GOLD_INGOT);
    udpig.setIngredient('N', Material.NETHERRACK);
    udpig.setIngredient('P', Material.GRILLED_PORK);

    ItemStack newItem10 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem10.setDurability((short)59);

    ShapedRecipe cspider = new ShapedRecipe(newItem10);

    cspider.shape(new String[] { "SAS", "SES", "SSS" });
    cspider.setIngredient('E', Material.EGG);
    cspider.setIngredient('S', Material.STRING);
    cspider.setIngredient('A', Material.FERMENTED_SPIDER_EYE);

    ItemStack newItem11 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem11.setDurability((short)60);

    ShapedRecipe sfish = new ShapedRecipe(newItem11);

    sfish.shape(new String[] { "AAA", "AEA", "SSS" });
    sfish.setIngredient('E', Material.EGG);
    sfish.setIngredient('S', Material.ENDER_STONE);
    sfish.setIngredient('A', Material.STONE);

    ItemStack newItem12 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem12.setDurability((short)61);

    ShapedRecipe blaze = new ShapedRecipe(newItem12);

    blaze.shape(new String[] { "SSS", "SES", "AAA" });
    blaze.setIngredient('E', Material.EGG);
    blaze.setIngredient('A', Material.NETHERRACK);
    blaze.setIngredient('S', Material.BLAZE_ROD);

    ItemStack newItem13 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem13.setDurability((short)62);

    ShapedRecipe mcube = new ShapedRecipe(newItem13);

    mcube.shape(new String[] { "SSS", "SES", "AAA" });
    mcube.setIngredient('E', Material.EGG);
    mcube.setIngredient('A', Material.NETHERRACK);
    mcube.setIngredient('S', Material.MAGMA_CREAM);

    ItemStack newItem14 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem14.setDurability((short)90);

    ShapedRecipe pig = new ShapedRecipe(newItem14);

    pig.shape(new String[] { "SSS", "SES", "SSS" });
    pig.setIngredient('E', Material.EGG);
    pig.setIngredient('S', Material.PORK);

    ItemStack newItem15 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem15.setDurability((short)91);

    ShapedRecipe sheep = new ShapedRecipe(newItem15);

    sheep.shape(new String[] { "SSS", "SES", "SSS" });
    sheep.setIngredient('E', Material.EGG);
    sheep.setIngredient('S', Material.WOOL);

    ItemStack newItem16 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem16.setDurability((short)92);

    ShapedRecipe cow = new ShapedRecipe(newItem16);

    cow.shape(new String[] { "SSS", "SES", "AAA" });
    cow.setIngredient('E', Material.EGG);
    cow.setIngredient('A', Material.RAW_BEEF);
    cow.setIngredient('S', Material.LEATHER);

    ItemStack newItem17 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem17.setDurability((short)93);

    ShapedRecipe chicken = new ShapedRecipe(newItem17);

    chicken.shape(new String[] { "SSS", "SES", "SAS" });
    chicken.setIngredient('E', Material.EGG);
    chicken.setIngredient('S', Material.FEATHER);
    chicken.setIngredient('A', Material.RAW_CHICKEN);

    ItemStack newItem18 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem18.setDurability((short)94);

    ShapedRecipe squid = new ShapedRecipe(newItem18);

    squid.shape(new String[] { "SSS", "SES", "SSS" });
    squid.setIngredient('E', Material.EGG);
    squid.setIngredient('S', Material.INK_SACK);

    ItemStack newItem19 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem19.setDurability((short)95);

    ShapedRecipe wolf = new ShapedRecipe(newItem19);

    wolf.shape(new String[] { "DDD", "BEB", "DBB" });
    wolf.setIngredient('E', Material.EGG);
    wolf.setIngredient('B', Material.BONE);
    wolf.setIngredient('D', Material.LEATHER);

    ItemStack newItem20 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem20.setDurability((short)96);

    ShapedRecipe mcow = new ShapedRecipe(newItem20);

    mcow.shape(new String[] { "ASA", "AEA", "DDD" });
    mcow.setIngredient('S', Material.RED_MUSHROOM);
    mcow.setIngredient('E', Material.EGG);
    mcow.setIngredient('A', Material.LEATHER);
    mcow.setIngredient('D', Material.RAW_BEEF);

    ItemStack newItem21 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem21.setDurability((short)98);

    ShapedRecipe ocelot = new ShapedRecipe(newItem21);

    ocelot.shape(new String[] { "LLL", "LEL", "BBL" });
    ocelot.setIngredient('L', Material.LEATHER);
    ocelot.setIngredient('E', Material.EGG);
    ocelot.setIngredient('B', Material.BONE);

    ItemStack newItem22 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem22.setDurability((short)120);

    ShapedRecipe villager = new ShapedRecipe(newItem22);

    villager.shape(new String[] { "LLL", "BEB", "BBB" });
    villager.setIngredient('L', Material.LEATHER);
    villager.setIngredient('E', Material.EGG);
    villager.setIngredient('B', Material.BONE);

    ItemStack newItem23 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem23.setDurability((short)66);

    ShapedRecipe witch = new ShapedRecipe(newItem23);

    witch.shape(new String[] { "LLL", "DED", "BCB" });
    witch.setIngredient('L', Material.LEATHER);
    witch.setIngredient('E', Material.EGG);
    witch.setIngredient('B', Material.BONE);
    witch.setIngredient('C', Material.BREWING_STAND);
    witch.setIngredient('D', Material.VINE);

    ItemStack newItem24 = new ItemStack(Material.MONSTER_EGG, 1);
    newItem24.setDurability((short)65);

    ShapedRecipe bat = new ShapedRecipe(newItem24);

    bat.shape(new String[] { "LLL", "BEB", "LLL" });
    bat.setIngredient('L', Material.LEATHER);
    bat.setIngredient('E', Material.EGG);
    bat.setIngredient('B', Material.BONE);
   
    ItemStack newItem25 = new ItemStack(Material.MOB_SPAWNER, 1);
    newItem25.setDurability((short)92); 
    
    ShapedRecipe spsheep = new ShapedRecipe(newItem25);

    spsheep.shape(new String[] { "iii", "isi", "iii" });
    spsheep.setIngredient('i', Material.IRON_FENCE);
    spsheep.setIngredient('s', Material.WOOL);
    


    getServer().addRecipe(spsheep);
    getServer().addRecipe(witch);
    getServer().addRecipe(bat);
    getServer().addRecipe(zombie);
    getServer().addRecipe(ghast);
    getServer().addRecipe(creeper);
    getServer().addRecipe(skeleton);
    getServer().addRecipe(blaze);
    getServer().addRecipe(udpig);
    getServer().addRecipe(pig);
    getServer().addRecipe(cow);
    getServer().addRecipe(slime);
    getServer().addRecipe(mcube);
    getServer().addRecipe(mcow);
    getServer().addRecipe(villager);
    getServer().addRecipe(ocelot);
    getServer().addRecipe(wolf);
    getServer().addRecipe(squid);
    getServer().addRecipe(chicken);
    getServer().addRecipe(sheep);
    getServer().addRecipe(sfish);
    getServer().addRecipe(cspider);
    getServer().addRecipe(spider);
    getServer().addRecipe(enderman);
  }

  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    return false;
  }
}