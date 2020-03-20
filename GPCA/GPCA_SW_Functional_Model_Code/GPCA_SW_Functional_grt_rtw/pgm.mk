#make -f pgm.mk test

program_NAME := test

program_C_SRCS := $(wildcard *.c)
program_C_OBJS := ${program_C_SRCS:.c=.o}


program_INCLUDE_DIRS := ../slprj/grt/INFUSION_MGR_Functional \
						../slprj/grt/GPCA_SW_Logical_Architecture \
						../slprj/grt/ALARM_Functional \
						../slprj/grt/_sharedutils \ 
#						.

CPPFLAGS += $(foreach includedir,$(program_INCLUDE_DIRS),-I$(includedir))

$(program_NAME): $(program_C_OBJS)
	gcc -o $(program_NAME) $(program_C_OBJS)
	
clean:
	@echo "============"
	@echo "$@"
	@- $(RM) $(program_NAME)
	@- $(RM) $(program_C_OBJS)
