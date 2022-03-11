package de.markusbordihn.minecraft.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class BosAPI {

  public static final Logger log = LogManager.getLogger(Constants.LOG_NAME);

  public BosAPI() {
    final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    modEventBus.addListener(ClientSetup::new);

    log.info("Register BO's API ...");
  }
}
