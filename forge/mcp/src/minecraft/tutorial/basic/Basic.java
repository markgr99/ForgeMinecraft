package tutorial.basic;

import javax.tools.Tool;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid=BasicInfo.ID, name=BasicInfo.NAME, version=BasicInfo.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Basic {
	//Clases de herramientas ect
	public static EnumToolMaterial Yggdrasil = EnumHelper.addToolMaterial("Yggdrasil", 4, 261087, 10.0F, 8.0F, 77);
	//Paginas
	public static final CreativeTabs Pagina = new Pagina(12, "L3tCraft");{
	}
	//Bloques
			public static final Block Tronco_Ygdrasil_1 = new Tronco_Ygdrasil_1(1000, Material.rock);{
				Tronco_Ygdrasil_1.setCreativeTab(Pagina);
				Tronco_Ygdrasil_1.setHardness(50f);
				Tronco_Ygdrasil_1.setStepSound(Block.soundWoodFootstep);
				Tronco_Ygdrasil_1.setUnlocalizedName("Tronco de Ygdrasil");
				Tronco_Ygdrasil_1.setLightValue(1.0f);
				Tronco_Ygdrasil_1.setBurnProperties(0, 0, 0);
				}
				public static final Block Madera_Ygdrasil = new Madera_Ygdrasil(1010, Material.rock);{
					Madera_Ygdrasil.setCreativeTab(Pagina);
					Madera_Ygdrasil.setHardness(40f);
					Madera_Ygdrasil.setStepSound(Block.soundWoodFootstep);
					Madera_Ygdrasil.setUnlocalizedName("Madera de Ygdrasil");
					Madera_Ygdrasil.setLightValue(2.0f);
					Madera_Ygdrasil.setBurnProperties(0, 0, 0);
					}
				public static final Block Hojas_Ygdrasil = new Hojas_Ygdrasil (1020, Material.leaves);{
					Hojas_Ygdrasil.setLightValue(1.0f);
					Hojas_Ygdrasil.setCreativeTab(Pagina);
					Hojas_Ygdrasil.setUnlocalizedName("Hojas de Ygdrasil");
					Hojas_Ygdrasil.setStepSound(Block.soundGrassFootstep);
					Hojas_Ygdrasil.setHardness(5f);
					Hojas_Ygdrasil.setBurnProperties(0, 0, 0);
					Hojas_Ygdrasil.setLightOpacity(1000);
				}
				public static final Block Sapling_Ygdrasil = new Sapling_Ygdrasil(1030, Material.sand);{
					Sapling_Ygdrasil.setLightValue(1.0f);
					Sapling_Ygdrasil.setCreativeTab(Pagina);
					Sapling_Ygdrasil.setUnlocalizedName("Brote de Ygdrasil");
					Sapling_Ygdrasil.setHardness(5f);
					Sapling_Ygdrasil.setBurnProperties(0, 0, 0);
				}
	//Items
	public static final Item Palos_Ygdrasil = new Palos_Ygdrasil(1100);{
		Palos_Ygdrasil.setCreativeTab(Pagina);
		Palos_Ygdrasil.setUnlocalizedName("Palos de Ygdrasil");
	}
	public static final ItemSword Espada_Yggdrasil = new Epada_Yggdrasil(1110,Yggdrasil);{
		Espada_Yggdrasil.setCreativeTab(Pagina);
		Espada_Yggdrasil.setUnlocalizedName("Espada de Yggdrasil");
	}
	public static final ItemPickaxe HolyPickaxe = new HolyPickaxe(1120, Yggdrasil);{
		HolyPickaxe.setCreativeTab(Pagina);
		HolyPickaxe.setUnlocalizedName("Pico de Yggdrasil");
	}
	public static final Item Lingote_Yggdrasil = new LingoteYggdrasil(1130);{
		Lingote_Yggdrasil.setCreativeTab(Pagina);
		Lingote_Yggdrasil.setUnlocalizedName("Lingote de Yggdrasil");
	}
	public static final  Item Estrella_Yggdrasil = new Estrella_Yggdrasil(1140);{
		Estrella_Yggdrasil.setCreativeTab(Pagina);
		Estrella_Yggdrasil.setUnlocalizedName("Estrella de Yggdrasil");
	}
	
	public static final Item ArmaDisparadora = new ArmaDisparadora(999);
        // The instance of your mod that Forge uses.
        @Instance(BasicInfo.NAME)
        public static Basic instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide=BasicInfo.CLIENTPROXY+"ClientProxy", serverSide=BasicInfo.COMMONPROXY+"CommonProxy")
        public static CommonProxy proxy;
        
        @EventHandler	
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                //Itemstacks
                ItemStack Madera_Ygdrasil_1 = new ItemStack(Madera_Ygdrasil, 1);
                ItemStack Madera_Ygdrasil_4 = new ItemStack(Madera_Ygdrasil, 4);
                ItemStack Palos_Ygdrasil_4 = new ItemStack(Palos_Ygdrasil, 4);
                ItemStack Palos_Ygdrasil_1 = new ItemStack(Palos_Ygdrasil, 1);
                ItemStack Estrella_Yggdrasil_1 = new ItemStack(Estrella_Yggdrasil, 1);
                ItemStack Pico_Yggdrasil_1 = new ItemStack(HolyPickaxe,1);
                ItemStack Lingote_Yggdrasil_1 = new ItemStack(Lingote_Yggdrasil,1);
                //Recetas
                GameRegistry.addShapelessRecipe(Madera_Ygdrasil_4, Tronco_Ygdrasil_1);
                GameRegistry.addRecipe(Palos_Ygdrasil_4, "x","x", 'x',Madera_Ygdrasil_1);
                GameRegistry.addRecipe(Pico_Yggdrasil_1, "xyx", " z ", " z ", 'x',Lingote_Yggdrasil_1, 'y',Estrella_Yggdrasil_1, 'z', Palos_Ygdrasil_1);
                //Registros juego
                GameRegistry.registerBlock(Tronco_Ygdrasil_1, "Tronco_Ygdrasil_1");
                GameRegistry.registerBlock(Hojas_Ygdrasil, "Hojas_Ygdrasil");
                GameRegistry.registerBlock(Madera_Ygdrasil, "Madera_Ygdrasil");
                GameRegistry.registerItem(Palos_Ygdrasil, "Palos_Ygdrasil");
                GameRegistry.registerBlock(Sapling_Ygdrasil, "Sapling_Ygdrasil");
                GameRegistry.registerItem(Espada_Yggdrasil, "Espada_de_Yggdrasil");
                GameRegistry.registerItem(HolyPickaxe, "Pico_de_Yggdrasil");
                GameRegistry.registerItem(Lingote_Yggdrasil, "Lingote_de_Yggdrasil");
                GameRegistry.registerItem(Estrella_Yggdrasil, "Estrella_de_Yggdrasil");
                //Registro persona
                LanguageRegistry.addName(Tronco_Ygdrasil_1, "Tronco de Ygdrasil");
                LanguageRegistry.addName(Hojas_Ygdrasil, "Hojas de Ygdrasil");
                LanguageRegistry.addName(Madera_Ygdrasil, "Madera de Ygdrasil");
                LanguageRegistry.addName(Palos_Ygdrasil, "Palos de Igdrasil");
                LanguageRegistry.addName(Sapling_Ygdrasil, "Brote de Ygdrasil");
                LanguageRegistry.addName(Espada_Yggdrasil, "Espada de Yggdrasil");
                LanguageRegistry.addName(HolyPickaxe, "Pico de Yggdrasil");
                LanguageRegistry.addName(Lingote_Yggdrasil, "Lingote de Yggdrasil");
                LanguageRegistry.addName(Estrella_Yggdrasil, "Estrella de Yggdrasil");
        }
        
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        	//Herramienta a usar
        	MinecraftForge.setBlockHarvestLevel(Tronco_Ygdrasil_1, "axe", 3);
        	MinecraftForge.setBlockHarvestLevel(Madera_Ygdrasil, "axe", 3);
        }
       
}