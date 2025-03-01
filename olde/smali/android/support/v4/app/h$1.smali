.class final Landroid/support/v4/app/h$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/app/h;


# direct methods
.method constructor <init>(Landroid/support/v4/app/h;)V
    .locals 0

    .prologue
    .line 451
    iput-object p1, p0, Landroid/support/v4/app/h$1;->a:Landroid/support/v4/app/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 454
    iget-object v0, p0, Landroid/support/v4/app/h$1;->a:Landroid/support/v4/app/h;

    invoke-virtual {v0}, Landroid/support/v4/app/h;->a()Z

    .line 455
    return-void
.end method
