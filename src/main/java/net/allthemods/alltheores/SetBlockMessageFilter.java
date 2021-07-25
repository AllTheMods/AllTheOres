package net.allthemods.alltheores;

import net.minecraft.server.level.WorldGenRegion;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.Node;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.filter.AbstractFilter;

/**
 * Blocks the log spam from worldgen in 1.17.1
 * TODO remove when this bug is fixed
 * @see WorldGenRegion#ensureCanWrite(net.minecraft.core.BlockPos)
 * @see <a href="https://bugs.mojang.com/browse/MC-125007">MC-125007</a>
 * @see <a href="https://bugs.mojang.com/browse/MC-230004">MC-230004</a>
 */
@Plugin(name = "SetBlockMessageFilter", category = Node.CATEGORY, elementType = Filter.ELEMENT_TYPE)
public class SetBlockMessageFilter extends AbstractFilter {
    @Override
    public Filter.Result filter(LogEvent event) {
        var message = event.getMessage();
        if (StringUtils.startsWith(message.getFormat(), "Detected setBlock in a far chunk")) {
            return Result.DENY;
        } else {
            return Result.NEUTRAL;
        }
    }
}
