#make -f pgm.mk test

program_NAME := test

#program_C_SRCS := $(wildcard *.c)
#program_C_OBJS := ${program_C_SRCS:.c=.o}

MODULES := _sharedutils _sharedutils_2 ALARM_Functional CONFIG_Functional \
			GPCA_SW_Functional GPCA_SW_Logical_Architecture INFUSION_MGR_Functional \
			Logging_Functional SYS_STATS_Functional System_Monitor_Functional \
			Top_Level_Mode_Functional
SRC_DIR   := $(addprefix ./,$(MODULES))
BUILD_DIR := ./build

SRC       := $(foreach sdir,$(SRC_DIR),$(wildcard $(sdir)/*.c))
OBJ       := $(foreach sdir,$(SRC_DIR),$(wildcard build/*.o))
#OBJ       := $(patsubst $(SRC_DIR)/%.c,build/%.o,$(SRC))

program_INCLUDE_DIRS := $(addprefix ../,$(MODULES))

CPPFLAGS += $(foreach includedir,$(program_INCLUDE_DIRS),-I$(includedir))

#$(program_NAME): checkdir $(program_C_OBJS)
$(program_NAME): checkdir $(OBJ)
	@echo "============"
	@echo $(SRC)
	@echo "============"
	@echo $(OBJ)
	@echo "============"
	@echo $(SRC_DIR)
	@echo "============"

checkdir: $(BUILD_DIR)

$(BUILD_DIR):
	@mkdir -p $@
	
clean:
	@echo "============"
	@echo "$@"
	@- $(RM) $(program_NAME)
	@- $(RM) $(program_C_OBJS)
	@rm -rf $(BUILD_DIR)
